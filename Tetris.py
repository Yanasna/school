import pygame
import random

pygame.init()

WIDTH, HEIGHT = 300, 600
ROWS, COLS = 20, 10 
BLOCK_SIZE = WIDTH // COLS


WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
BLUE = (0, 0, 255)

SHAPES = [
    [[1, 1, 1, 1]],
    [[1, 1], [1, 1]],
    [[0, 1, 0], [1, 1, 1]],
    [[0, 1, 1], [1, 1, 0]],
    [[1, 1, 0], [0, 1, 1]],
    [[1, 0, 0], [1, 1, 1]],
    [[0, 0, 1], [1, 1, 1]],
]

def create_board(): 
    return [[0 for _ in range(COLS)] for _ in range(ROWS)]

def draw_block(screen, shape, x, y) : 
    for row_idx, row in enumerate(shape) :
        for col_idx, cell in enumerate(row) : 
            if cell :  
                pygame.draw.rect(
                    screen,
                    BLUE,
                    (x + col_idx * BLOCK_SIZE, y + row_idx * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE),
                )

def check_collision(board, shape, x,  y) : 
    for row_idx, row in enumerate(shape)  : 
        for col_idx, cell in enumerate(row) :
            if cell  : 
                board_x = (x // BLOCK_SIZE) + col_idx
                board_y =  (y // BLOCK_SIZE) + row_idx
                
                if board_x < 0 or board_x >= COLS or board_y >= ROWS  :
                    return True
                if board_y >= 0 and board[board_y][board_x] != 0:
                    return True
    return False

def place_block(board, shape, x, y) : 
    for row_idx, row in enumerate(shape) : 
        for col_idx, cell in enumerate(row) : 
            if cell : 
                board_x = (x // BLOCK_SIZE) + col_idx
                board_y = (y // BLOCK_SIZE) + row_idx
                if 0 <= board_x < COLS and 0 <= board_y < ROWS : 
                    board[board_y][board_x] = 1

def main():
    screen = pygame.display.set_mode((WIDTH, HEIGHT)) 
    pygame.display.set_caption("Tetris") #setTitle

    clock = pygame.time.Clock() 
    drop_time = 0 
    board = create_board()
    running = True

    current_block = random.choices(SHAPES)
    block_x, block_y = 4 * BLOCK_SIZE, 0

    while running: 
        screen.fill(BLACK)

        for event in pygame.event.get() : 
            if event.type == pygame.QUIT : 
                running = False  #event.type이 QUIT가 되면 종료.
       
        drop_time += clock.get_rawtime()
        if drop_time > 10 :
            block_y += BLOCK_SIZE
            drop_time = 0 # 시간 설정해서 
            
        
        keys = pygame.key.get_pressed()
        if keys[pygame.K_LEFT] : 
            if block_x > 0 : #블럭 못나가게 막는다. 0쪽
                block_x -= BLOCK_SIZE
        if keys[pygame.K_RIGHT] : 
            if block_x + len(current_block[0]) * BLOCK_SIZE < WIDTH : 
                block_x += BLOCK_SIZE
        if keys[pygame.K_DOWN] : 
            block_y += BLOCK_SIZE

        draw_block(screen, current_block, block_x, block_y)
        
        if check_collision(board, current_block, block_x,  block_y + BLOCK_SIZE) : 
            place_block(board, current_block, block_x, block_y)
            current_block = random.choice(SHAPES)
            block_x, block_y = 4 * BLOCK_SIZE, 0 
        
        pygame.display.flip()
        clock.tick(10)

    pygame.quit()

if __name__ == "__main__":
    main()