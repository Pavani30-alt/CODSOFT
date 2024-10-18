import math
HUMAN = 'X'
AI = 'O'
EMPTY = ' '
board = [[EMPTY, EMPTY, EMPTY],
         [EMPTY, EMPTY, EMPTY],
         [EMPTY, EMPTY, EMPTY]]
def print_board(board):
    for row in board:
        print("|".join(row))
        print("-" * 5)
def is_moves_left(board):
    for row in board:
        if EMPTY in row:
            return True
    return False
def evaluate(board):
    for row in board:
        if row[0] == row[1] == row[2] != EMPTY:
            return 10 if row[0] == AI else -10
    for col in range(3):
        if board[0][col] == board[1][col] == board[2][col] != EMPTY:
            return 10 if board[0][col] == AI else -10
    if board[0][0] == board[1][1] == board[2][2] != EMPTY:
        return 10 if board[0][0] == AI else -10

    if board[0][2] == board[1][1] == board[2][0] != EMPTY:
        return 10 if board[0][2] == AI else -10
    return 0
def minimax(board, depth, is_maximizing):
    score = evaluate(board)
    if score == 10:
        return score - depth
    if score == -10:
        return score + depth
    if not is_moves_left(board):
        return 0
    if is_maximizing:
        best = -math.inf

        for i in range(3):
            for j in range(3):
                if board[i][j] == EMPTY:
                    board[i][j] = AI
                    best = max(best, minimax(board, depth + 1, False))
                    board[i][j] = EMPTY
        return best
    else:
        best = math.inf

        for i in range(3):
            for j in range(3):
                if board[i][j] == EMPTY:
                    board[i][j] = HUMAN
                    best = min(best, minimax(board, depth + 1, True))
                    board[i][j] = EMPTY
        return best
def find_best_move(board):
    best_val = -math.inf
    best_move = (-1, -1)

    for i in range(3):
        for j in range(3):
            if board[i][j] == EMPTY:
                board[i][j] = AI
                move_val = minimax(board, 0, False)
                board[i][j] = EMPTY

                if move_val > best_val:
                    best_move = (i, j)
                    best_val = move_val

    return best_move
def is_game_over(board):
    return evaluate(board) != 0 or not is_moves_left(board)
def play_game():
    print("Welcome to Tic-Tac-Toe! You are 'X' and AI is 'O'")
    while True:
        print_board(board)
        if is_game_over(board):
            break
        row, col = map(int, input("Enter your move (row and column): ").split())
        if board[row][col] != EMPTY:
            print("Invalid move, try again.")
            continue
        board[row][col] = HUMAN
        if not is_game_over(board):
            ai_move = find_best_move(board)
            board[ai_move[0]][ai_move[1]] = AI
            print(f"AI placed at {ai_move[0]}, {ai_move[1]}")
    print_board(board)
    result = evaluate(board)
    if result == 10:
        print("AI wins!")
    elif result == -10:
        print("You win!")
    else:
        print("It's a draw!")
if __name__ == "__main__":
    play_game()
