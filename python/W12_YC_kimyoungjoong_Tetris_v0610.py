import sys
import pygame
import random
# Pygame 초기화
pygame.init()
# 화면 크기 설정
WIDTH, HEIGHT = 300, 600
ROWS, COLS = 20, 10
BLOCK_SIZE = WIDTH // COLS
# 색상 정의
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
BLUE = (0, 0, 255)
# 블록 모양 정의 (I, O, T, S, Z, L, J)

SHAPES = [
 [[1, 1, 1, 1]], # I
 [[1, 1], [1, 1]], # O
 [[0, 1, 0], [1, 1, 1]], # T
 [[1, 1, 0], [0, 1, 1]], # S
 [[1, 1, 0], [0, 1, 1]], # Z
 [[1, 0, 0], [1, 1, 1]], # L
 [[0, 0, 1], [1, 1, 1]], # J
 #[[1, 0, 1], [1, 1, 1]], # ㄷ자블록
 #[[1, 1, 1], [1, 1, 1], [1, 1, 1]] #큰 ㅁ블록
]

BLOCKS = [
 [[1, 1, 1, 1]], # I
 [[1, 1], [1, 1]], # O
 [[0, 1, 0], [1, 1, 1]], # T
 [[1, 1, 0],[0, 1, 1]], # S
 [[1, 1, 0], [0, 1, 1]], # Z
 [[1, 0, 0], [1, 1, 1]], # L
 [[0, 0, 1], [1, 1, 1]], # J

]
# 게임 보드 초기화
def create_board():
    return [[0 for _ in range(COLS)] for _ in range(ROWS)]

# 블록 돌리는 함수
def rotate_block(block) : 
    return [list(row) for row in zip(*block[::-1])]

def opposite_rotate_block(block) : 
    return [list(row) for row in zip(*block)]


#Board 그리는 함수
def draw_board(screen, board) : 
     for row_idx, row in enumerate(board): 
        for col_idx, cell in enumerate(row):
            if cell:
                pygame.draw.rect(screen, (255,255,255),
                                 (col_idx * BLOCK_SIZE, row_idx * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE))
               #pygame.draw.rect(screen, (0, 0, 0), (col_idx * BLOCK_SIZE, row_idx * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE), 1)

# 블록 그리기 함수
def draw_block(screen, shape, x, y):
    for row_idx, row in enumerate(shape):
        for col_idx, cell in enumerate(row):
            if cell:
                pygame.draw.rect(
                    screen,
                    BLUE,
                    (x + col_idx * BLOCK_SIZE, y + row_idx * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE),
                )

#def check_collision(board, shape, x, y):
 #   for row_idx, row in enumerate(shape):
  #      for col_idx, cell in enumerate(row):
   #         if cell:
    #            board_x = (x // BLOCK_SIZE) + col_idx
     #           board_y = (y // BLOCK_SIZE) + row_idx
      #          # 경계 밖으로 나가거나, 이미 고정된 블록이 있는 경우 충돌
       #         if board_x < 0 or board_x >= COLS or board_y >= ROWS:
        #            return True
         #       if board_y >= 0 and board[board_y][board_x] != 0:
          #          print("no collision")
           #         return True
   # return False

def check_collision(board, shape, x, y) : 
    for row_idx, row in enumerate(shape) : 
        for col_idx, cell in enumerate(row) : 
            if cell : 
                board_x = (x // BLOCK_SIZE) + col_idx
                board_y = (y // BLOCK_SIZE) + row_idx
                if board_x < 0 or board_x >= COLS or board_y >= ROWS : 
                    return True
                if board_y >= 0 and board[board_y][board_x] != 0 : 
                    return True
    return False


def place_block(board, shape, x, y):
    for row_idx, row in enumerate(shape): 
        for col_idx, cell in enumerate(row):
            if cell:
                board_x = (x // BLOCK_SIZE) + col_idx
                board_y = (y // BLOCK_SIZE) + row_idx
                if 0 <= board_x < COLS and 0 <= board_y < ROWS:
                    board[board_y][board_x] = 1


def clear_lines(board) : #블록 지우는 함수
    cleared_rows = 0 
    new_board = []
    for row in board : 
        if all(cell == 1 for cell in row) : 
            cleared_rows += 1
        else : 
            new_board.append(row)
            
    for _ in range(cleared_rows) : 
        new_board.insert(0, [0] * COLS)
    return new_board, cleared_rows 

def calculate_score(cleared_rows) : #점수 추가 함수
    score_table = {1 : 100, 2 : 300, 3 : 500, 4 : 800}
    return score_table.get(cleared_rows, 0)

def new_block() : 
    return random.choice(BLOCKS)

current_block = new_block()
next_block = new_block()

def shift_block() : 
    global current_block, next_block
    current_block = next_block
    next_block = new_block()

def draw_next_block(screen, font, block, x, y): 
    for row_idx, row in enumerate(block) : 
        for col_idx, val in enumerate(row) :  
            if val :  
                pygame.draw.rect(screen, (0, 255, 0), (x + col_idx * 20, y + row_idx * 20, 18, 18))
    
    label = font.render("Next", True, (255, 255, 255))
    screen.blit(label, (x, y -30))

def main():
    global current_block, next_block
    screen = pygame.display.set_mode((WIDTH, HEIGHT))
    pygame.display.set_caption("Tetris")
    clock = pygame.time.Clock()
    board = create_board()
    
    running = True

    block_x, block_y = 4 * BLOCK_SIZE, 0
    
    drop_time = 0
    score = 0
    block_speed = 0
    speed = 50
    
    while running:
        screen.fill(BLACK)
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False
                
        dt = clock.tick(60)  # 초당 60프레임 유지
        drop_time += dt
        drop_time += clock.get_rawtime()

        draw_board(screen, board)
        #if drop_time > 50 : # 500ms마다 블록이 한 칸 하강
        #    block_y += BLOCK_SIZE
        #    drop_time = 0
        
        # 블록 이동 로직
        keys = pygame.key.get_pressed()
        if keys[pygame.K_LEFT]:
            if not check_collision(board, current_block, block_x - BLOCK_SIZE, block_y) : 
                block_x -= BLOCK_SIZE
        if keys[pygame.K_RIGHT]:
            if not check_collision(board, current_block, block_x +BLOCK_SIZE, block_y) : 
                block_x += BLOCK_SIZE
        if keys[pygame.K_DOWN]:
            if not check_collision(board, current_block, block_x, block_y + BLOCK_SIZE) : 
                block_y += BLOCK_SIZE
        if keys[pygame.K_UP] : 
            current_block = rotate_block(current_block) 
        if keys[pygame.K_z] : 
            current_block = opposite_rotate_block(current_block) 
        
        #if check_collision(board, current_block, block_x, block_y + BLOCK_SIZE):
        #    block_y -= BLOCK_SIZE
        #    place_block(board, current_block, block_x, block_y)
        #    current_block = random.choice(SHAPES) # 새로운 블록 생성
        #    block_x, block_y = 4 * BLOCK_SIZE, 0 # 초기 위치로 이동
        # 게임 보드와 블록 그리기
        if drop_time > speed :
            if not check_collision(board, current_block, block_x, block_y + BLOCK_SIZE) : 
                # 500ms마다 블록이 한 칸 하강
                block_y += BLOCK_SIZE
            else : 
                place_block(board, current_block, block_x, block_y) 
                board, cleared_rows = clear_lines(board)
                score += calculate_score(cleared_rows)
                current_block  # 새로운 블록 생성
                block_x, block_y = 4 * BLOCK_SIZE, 0
                shift_block()
                if check_collision(board, current_block, block_x, block_y) : 
                    print("Game OVER!")
                    running = False
            drop_time = 0

        draw_block(screen, current_block, block_x, block_y)
        
        if score >= (block_speed + 100) : #점수출력
            speed -= 10
            block_speed += score
            
            print(f'score : {score}')
            print(f'speed : {speed}')
            
            
        font = pygame.font.SysFont("Arial", 24)  #글자크기, 글씨체
        score_text = font.render(f"Score : {score}", True, WHITE) #글자색상, score_text설정
        screen.blit(score_text, (10, 10)) 
        
        draw_next_block(screen, font, next_block, 20, 70)
        pygame.display.flip()
        clock.tick(10)
    pygame.quit()

if __name__ == "__main__":
    main()