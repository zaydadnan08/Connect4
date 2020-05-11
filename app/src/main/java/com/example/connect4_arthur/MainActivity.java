package com.example.connect4_arthur;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Random;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random = new Random();
        int first = random.nextInt(2);
        if (first == 1) {
            arthur();
        }
    }

    int board[][] = new int[6][7];
    int turn = 0;

    private boolean is_valid(int col, int[][]board) {
        return board[5][col] == 0;
    }

    private int next_row(int column, int[][] board) {
        for (int i = 0; i < 6; i++) {
            if (board[i][column] == 0) {
                return i;
            }
        }
        return 0;
    }

    private void drop_piece(int col, int[][] cboard, boolean check, int player) {
        if (is_valid(col, cboard)) {
            int row = next_row(col, cboard);
            if (player == 0) { //red piece
                cboard[row][col] = 1;
                winner(board);
                if (check) display(1, row, col);
                if (!is_valid(col, cboard) && check) {
                    hide_button(col);
                }
                return;
            } else { //yellow piece
                cboard[row][col] = 2;
                winner(board);
                if (check) display(0, row, col);
                if (!is_valid(col, cboard) && check) {
                    hide_button(col);
                }
                return;
            }
        }
    }

    private void display(int user, int row, int col) {
        switch (row) {

            case 0:
                switch (col) {
                    case 0:
                        Button b00 = (Button) findViewById(R.id.b00);
                        if (user == 0) {
                            b00.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b00.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 1:
                        Button b01 = (Button) findViewById(R.id.b01);
                        if (user == 0) {
                            b01.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b01.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 2:
                        Button b02 = (Button) findViewById(R.id.b02);
                        if (user == 0) {
                            b02.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b02.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 3:
                        Button b03 = (Button) findViewById(R.id.b03);
                        if (user == 0) {
                            b03.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b03.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 4:
                        Button b04 = (Button) findViewById(R.id.b04);
                        if (user == 0) {
                            b04.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b04.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 5:
                        Button b05 = (Button) findViewById(R.id.b05);
                        if (user == 0) {
                            b05.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b05.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 6:
                        Button b06 = (Button) findViewById(R.id.b06);
                        if (user == 0) {
                            b06.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b06.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                }
                break;
            case 1:
                switch (col) {
                    case 0:
                        Button b10 = (Button) findViewById(R.id.b10);
                        if (user == 0) {
                            b10.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b10.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 1:
                        Button b11 = (Button) findViewById(R.id.b11);
                        if (user == 0) {
                            b11.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b11.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 2:
                        Button b12 = (Button) findViewById(R.id.b12);
                        if (user == 0) {
                            b12.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b12.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 3:
                        Button b13 = (Button) findViewById(R.id.b13);
                        if (user == 0) {
                            b13.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b13.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 4:
                        Button b14 = (Button) findViewById(R.id.b14);
                        if (user == 0) {
                            b14.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b14.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 5:
                        Button b15 = (Button) findViewById(R.id.b15);
                        if (user == 0) {
                            b15.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b15.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 6:
                        Button b16 = (Button) findViewById(R.id.b16);
                        if (user == 0) {
                            b16.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b16.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                }
                break;
            case 2:
                switch (col) {
                    case 0:
                        Button b20 = (Button) findViewById(R.id.b20);
                        if (user == 0) {
                            b20.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b20.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 1:
                        Button b21 = (Button) findViewById(R.id.b21);
                        if (user == 0) {
                            b21.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b21.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 2:
                        Button b22 = (Button) findViewById(R.id.b22);
                        if (user == 0) {
                            b22.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b22.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 3:
                        Button b23 = (Button) findViewById(R.id.b23);
                        if (user == 0) {
                            b23.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b23.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 4:
                        Button b24 = (Button) findViewById(R.id.b24);
                        if (user == 0) {
                            b24.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b24.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 5:
                        Button b25 = (Button) findViewById(R.id.b25);
                        if (user == 0) {
                            b25.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b25.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 6:
                        Button b26 = (Button) findViewById(R.id.b26);
                        if (user == 0) {
                            b26.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b26.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                }
                break;
            case 3:
                switch (col) {
                    case 0:
                        Button b30 = (Button) findViewById(R.id.b30);
                        if (user == 0) {
                            b30.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b30.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 1:
                        Button b31 = (Button) findViewById(R.id.b31);
                        if (user == 0) {
                            b31.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b31.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 2:
                        Button b32 = (Button) findViewById(R.id.b32);
                        if (user == 0) {
                            b32.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b32.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 3:
                        Button b33 = (Button) findViewById(R.id.b33);
                        if (user == 0) {
                            b33.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b33.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 4:
                        Button b34 = (Button) findViewById(R.id.b34);
                        if (user == 0) {
                            b34.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b34.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 5:
                        Button b35 = (Button) findViewById(R.id.b35);
                        if (user == 0) {
                            b35.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b35.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 6:
                        Button b36 = (Button) findViewById(R.id.b36);
                        if (user == 0) {
                            b36.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b36.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                }
                break;
            case 4:
                switch (col) {
                    case 0:
                        Button b40 = (Button) findViewById(R.id.b40);
                        if (user == 0) {
                            b40.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b40.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 1:
                        Button b41 = (Button) findViewById(R.id.b41);
                        if (user == 0) {
                            b41.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b41.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 2:
                        Button b42 = (Button) findViewById(R.id.b42);
                        if (user == 0) {
                            b42.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b42.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 3:
                        Button b43 = (Button) findViewById(R.id.b43);
                        if (user == 0) {
                            b43.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b43.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 4:
                        Button b44 = (Button) findViewById(R.id.b44);
                        if (user == 0) {
                            b44.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b44.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 5:
                        Button b45 = (Button) findViewById(R.id.b45);
                        if (user == 0) {
                            b45.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b45.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 6:
                        Button b46 = (Button) findViewById(R.id.b46);
                        if (user == 0) {
                            b46.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b46.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                }
                break;
            case 5:
                switch (col) {
                    case 0:
                        Button b50 = (Button) findViewById(R.id.b50);
                        if (user == 0) {
                            b50.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b50.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 1:
                        Button b51 = (Button) findViewById(R.id.b51);
                        if (user == 0) {
                            b51.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b51.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 2:
                        Button b52 = (Button) findViewById(R.id.b52);
                        if (user == 0) {
                            b52.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b52.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 3:
                        Button b53 = (Button) findViewById(R.id.b53);
                        if (user == 0) {
                            b53.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b53.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 4:
                        Button b54 = (Button) findViewById(R.id.b54);
                        if (user == 0) {
                            b54.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b54.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 5:
                        Button b55 = (Button) findViewById(R.id.b55);
                        if (user == 0) {
                            b55.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b55.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                    case 6:
                        Button b56 = (Button) findViewById(R.id.b56);
                        if (user == 0) {
                            b56.setBackgroundResource(R.drawable.yellow_btn);
                        } else {
                            b56.setBackgroundResource(R.drawable.red_btn);
                        }
                        break;
                }
                break;
        }
    }

    private boolean winning_move(int player, int[][] board) {
        // send in player + 1 as player 1: is 0 turn, 1 in val
        // Check horizontal locations for win
        for (int c = 0; c < 4; c++) {
            for (int r = 0; r < 6; r++) {
                if (board[r][c] == player && board[r][c + 1] == player & board[r][c + 2] == player && board[r][c + 3] == player)
                    return true;
            }
        }
        // Check vertical locations for win
        for (int c = 0; c < 7; c++) {
            for (int r = 0; r < 3; r++) {
                if (board[r][c] == player && board[r + 1][c] == player && board[r + 2][c] == player && board[r + 3][c] == player)
                    return true;
            }
        }
        // Check positively sloped diaganols
        for (int c = 0; c < 4; c++) {
            for (int r = 0; r < 3; r++) {
                if (board[r][c] == player && board[r + 1][c + 1] == player && board[r + 2][c + 2] == player && board[r + 3][c + 3] == player)
                    return true;
            }
        }

        // Check negatively sloped diaganols
        for (int c = 0; c < 4; c++) {
            for (int r = 3; r < 6; r++) {
                if (board[r][c] == player && board[r - 1][c + 1] == player && board[r - 2][c + 2] == player && board[r - 3][c + 3] == player)
                    return true;
            }
        }
        return false;
    }

    private boolean game_over(int[][] cboard) {
        for (int r = 0; r < 6; r++) {
            for (int c = 0; c < 7; c++) {
                if (cboard[r][c] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private void winner(int [][] board) {
        TextView text = (TextView) findViewById(R.id.textView2);
        if (winning_move(turn + 1, board)) {
            if (turn == 0) {
                text.setText("Player 2 Wins!");
                int col = Color.RED;
                text.setTextColor(col);
                clear_board();
            } else {
                text.setText("Player 1 Wins!");
                int col = Color.YELLOW;
                text.setTextColor(col);
                clear_board();
            }
        } else if (game_over(board)) {
            int col = Color.BLACK;
            text.setTextColor(col);
            text.setText("GAME OVER");
            clear_board();
        }
    }

    private void clear_board(){
        hide_button(0);
        hide_button(1);
        hide_button(2);
        hide_button(3);
        hide_button(4);
        hide_button(5);
        hide_button(6);
    }

    private boolean empty_board() {
        for (int r = 0; r < 6; r++) {
            for (int c = 0; c < 7; c++) {
                if (board[r][c] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private int get_valid_locations(int[][] board){
        int counter = 0;
        for(int c =0; c < 7; c++){
            if (is_valid(c, board)){
                counter++;
            }
        }
        return counter;
    }

    //region btnclick
    public void row0(View view) {
        turn = (turn + 1) % 2;
        drop_piece(0, board, true, 1);
        arthur();
    }

    public void row1(View view) {
        turn = (turn + 1) % 2;
        drop_piece(1, board, true, 1);
        arthur();
    }

    public void row2(View view) {
        turn = (turn + 1) % 2;
        drop_piece(2, board, true, 1);
        arthur();
    }

    public void row3(View view) {
        turn = (turn + 1) % 2;
        drop_piece(3, board, true, 1);
        arthur();
    }

    public void row4(View view) {
        turn = (turn + 1) % 2;
        drop_piece(4, board, true, 1);
        arthur();
    }

    public void row5(View view) {
        turn = (turn + 1) % 2;
        drop_piece(5, board, true, 1);
        arthur();
    }

    public void row6(View view) {
        turn = (turn + 1) % 2;
        drop_piece(6, board, true, 1);
        arthur();
    }

    //endregion

    private int[] valid_col(int[][] board) {
        int[] columns = new int[get_valid_locations(board)];
        int pos = 0;
        for (int i = 0; i < 7; i++) {
            if (is_valid(i, board)) {
                columns[pos] = i;
                pos++;
            }
        }
        return columns;
    }

    private int[] single_row(int row, int[][] tmp) {
        int[] rows = new int[7];
        for (int i = 0; i < 7; i++) {
            rows[i] = tmp[row][i];
        }
        return rows;
    }

    private int[] single_column(int col, int[][] tmp) {
        int[] column = new int[6];
        for (int i = 0; i < 6; i++) {
            column[i] = tmp[i][col];
        }
        return column;
    }

    private int[] slope(int row, int col, int[][] tmp, int sign) {
        int[] slope = new int[4];
        for (int i = 0; i < 4; i++) {
            if (sign == 1) {slope[i] = tmp[row + i][col + i];} //positive slope
            else {slope[i] = tmp[row + i][col - i];} //negative slope
        }
        return slope;
    }

    private int count(int arr[], int piece, int len) {
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == piece) {
                count += 1;
            }
        }
        return count;
    }

    private int[][] copy_board(int[][] board) {
        int tmp[][] = new int[6][7];
        for (int r = 0; r < 6; r++) {
            for (int c = 0; c < 7; c++) {
                int val = board[r][c];
                tmp[r][c] = val;
            }
        }
        return tmp;
    }

    private int evaluate_window(int[] window) {
        int score = 0;
        if (count(window, 1, 4) == 4) { //4 in row
            score += 100;
        } else if (count(window, 1, 4) == 3 && count(window, 0, 4) == 1) { //3 in row
            score += 5;
        } else if (count(window, 1, 4) == 2 && count(window, 0, 4) == 2) { //2 in row
            score += 2;
        }
        if (count(window, 2, 4) == 3 && count(window, 0, 4) == 1) {
            score -= 50;
        }
        //basically saying if chosen position lets opp have 3 in row, not good position ie score -=80
        return score;
    }

    private int score_position(int[][] temp) {
        int score = 0;
        int[] center_arr = single_column(3, temp);
        int centerCount = count(center_arr, 1, 6);
        score += centerCount * 3;
        //horizontal position
        for (int r = 0; r < 6; r++) {
            int[] row_arr = single_row(r, temp);
            for (int c = 0; c < 4; c++) {
                int[] window = Arrays.copyOfRange(row_arr, c, c + 4); // 4 is window length
                score += evaluate_window(window);
            }
        }

        //vertical position
        for (int c = 0; c < 7; c++) {
            int[] col_arr = single_column(c, temp);
            for (int r = 0; r < 3; r++) {
                int[] window = Arrays.copyOfRange(col_arr, r, r + 4);
                score += evaluate_window(window);
            }
        }

        //positively sloped diagonal
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 4; c++) {
                int[] window = slope(r, c, temp, 1);
                score += evaluate_window(window);
            }
        }

        //negativly sloped diagonal
        for (int r = 0; r < 3; r++) {
            for (int c = 3; c < 7; c++) {
                int[] window = slope(r, c, temp, 0);
                score += evaluate_window(window);
            }
        }
        return score;

    }

    private int pick_best_move() {
        int best_score = -10000;
        int[] valid_columns = valid_col(board);
        int len = get_valid_locations(board);
        Random random = new Random();
        int rand = random.nextInt(len);
        int best_column = valid_columns[rand];

        for (int col = 0; col < len; col++) {
            int tmp[][] = copy_board(board);
            drop_piece(valid_columns[col], tmp, false, 0);

            int score = score_position(tmp);

            if (score > best_score) {
                best_score = score;
                best_column = valid_columns[col];
            }
        }
        return best_column;
    }

    private boolean terminal_node(int[][] board) {
        return (game_over(board) || winning_move(1, board) || winning_move (2, board));
    }

    final class MyResult {
        private final int col;
        private final int score;

        public MyResult(int col, int score) {
            this.col = col;
            this.score = score;
        }

        public int getCol() {
            return col;
        }

        public int getScore() {
            return score;
        }
    }

    private MyResult minimax(int[][] board, int depth, int alpha, int beta,  boolean maximisedPlayer) {
        int[] validlocations = valid_col(board);
        int len = get_valid_locations(board);

        if(depth==0 || terminal_node(board)) {
            if (terminal_node(board)) {
                if (winning_move(1, board)) return new MyResult(6, 100000000);
                else if (winning_move(2, board)) return new MyResult(6, -100000000);
                else return new MyResult(6, 0);
            } else return new MyResult(6, score_position(board));
        }

        if(maximisedPlayer){
            int value = Integer.MIN_VALUE;
            int column = validlocations[0];
            for(int col = 0; col < len; col++){
                int tmp[][] = copy_board(board);
                drop_piece(validlocations[col],tmp,false, 0);
                int new_score = minimax(tmp, depth-1, alpha, beta, false).score;
                if(new_score > value){
                    value = new_score;
                    column = validlocations[col];
                }
                alpha = Math.max(alpha, value);
                if (alpha >= beta) break;
            }
            return new MyResult(column, value);
        }

        else {
            int value = Integer.MAX_VALUE;
            int column = validlocations[0];
            for(int col = 0; col < len; col++){
                int tmp[][] = copy_board(board);
                drop_piece(validlocations[col],tmp,false, 1);
                int new_score = minimax(tmp, depth-1, alpha, beta, true).score;
                if(new_score < value){
                    value = new_score;
                    column = validlocations[col];
                }
                beta = Math.min(beta, value);
                if (alpha >= beta) break;
            }
            return new MyResult(column, value);
        }
    }

    private void arthur() {
        /* make sure arthur is always red*/ if (empty_board()) { turn = 1; }
        if (!game_over(board)) {
            turn = (turn + 1) % 2;
            //int column = pick_best_move();
            int column = minimax(board, 5, Integer.MIN_VALUE, Integer.MAX_VALUE, true).col;
            drop_piece(column, board, true, 0);
        }
    }

    private void hide_button(int col) {
        switch (col) {
            case 0:
                Button row0 = (Button) findViewById(R.id.row0);
                row0.setVisibility(View.INVISIBLE);
                break;
                case 1:
                Button row1 = (Button) findViewById(R.id.row1);
                row1.setVisibility(View.INVISIBLE);
                break;
                case 2:
                Button row2 = (Button) findViewById(R.id.row2);
                row2.setVisibility(View.INVISIBLE);
                break;
                case 3:
                Button row3 = (Button) findViewById(R.id.row3);
                row3.setVisibility(View.INVISIBLE);
                break;
                case 4:
                Button row4 = (Button) findViewById(R.id.row4);
                row4.setVisibility(View.INVISIBLE);
                break;
                case 5:
                Button row5 = (Button) findViewById(R.id.row5);
                row5.setVisibility(View.INVISIBLE);
                break;
                case 6:
                Button row6 = (Button) findViewById(R.id.row6);
                row6.setVisibility(View.INVISIBLE);
                break;
        }
    }
}