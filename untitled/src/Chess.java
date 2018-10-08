import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


    public class Chess {
        public static void main(String[] args) throws IOException {
            String [][] field = new String [8][8];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    field[i][j] = "- ";
                }
            }
            Scanner in = new Scanner( System.in );
            int pkX = 1, pkY=0;
            int plX = 0, plY=0;
            int pk1X =6, pk1Y=0;
            int pl1X =7, pl1Y=0;
            int psX =2 , psY=0;
            int ps1X =5, ps1Y=0;
            int pfX =3 , pfY=0;
            int pkiX =4, pkiY=0;
            field[1][0] = "K1";
            field[0][0] = "L1";
            field[6][0] = "K2";
            field[7][0] = "L2";
            field[2][0] = "S1";
            field[5][0] ="S2";
            field[3][0] ="Fe";
            field[4][0] = "Ki";
            printField( field );
            while (true) {
                System.out.println( "Ходи!" );
                String figure = in.next();
                String s = in.next();
                int pX = s.charAt( 0 ) - 'A', pY = s.charAt( 1 ) - '1';
                System.out.println( pX + " " + pY );
                switch (figure) {
                    case "K1":
                        if (((pkY - pY == 1) || (pkY - pY == -1) || (pkY - pY == 2) || (pkY - pY == -2)) && ((pkX - pX == -2) || (pkX - pX == 2) || (pkX - pX == 1) || (pkX - pX == -1))) {
                            field[pX][pY] = "K1";
                            field[pkX][pkY] = "- ";
                            pkX = pX;
                            pkY = pY;
                            printField( field );
                        } else {
                            System.out.println( "Такой ход невозможен!" );
                            continue;
                        }
                        break;
                    case "K2":
                        if (((pk1Y - pY == 1) || (pk1Y - pY == -1) || (pk1Y - pY == 2) || (pk1Y - pY == -2)) && ((pk1X - pX == -2) || (pk1X - pX == 2) || (pk1X - pX == 1) || (pk1X - pX == -1))) {
                            field[pX][pY] = "K2";
                            field[pk1X][pk1Y] = "- ";
                            pk1X = pX;
                            pk1Y = pY;
                            printField( field );
                        } else {
                            System.out.println( "Такой ход невозможен!" );
                            continue;
                        }
                        break;
                    case "L1":
                        if ((plY - pY == 0) || (plX - pX == 0)) {
                            field[pX][pY] = "L1";
                            field[plX][plY] = "- ";
                            plX = pX;
                            plY = pY;
                            printField( field );
                        } else {
                            System.out.println( "Такой ход невозможен!" );
                            continue;
                        }
                        break;
                    case "L2":
                        if ((pl1Y - pY == 0) || (pl1X - pX == 0)) {
                            field[pX][pY] = "L2";
                            field[pl1X][pl1Y] = "- ";
                            pl1X = pX;
                            pl1Y = pY;
                            printField( field );
                        } else {
                            System.out.println( "Такой ход невозможен!" );
                            continue;
                        }
                        break;
                    case "S1":
                        if (Math.abs( psY - pY) == Math.abs( psX - pX)){
                            field[pX][pY] = "S1";
                            field[psX][psY] = "- ";
                            psX = pX;
                            psY = pY;
                            printField( field );
                        } else {
                            System.out.println( "Такой ход невозможен!" );
                            continue;
                        }
                        break;
                    case "S2":
                        if (Math.abs( ps1Y - pY) == Math.abs( ps1X - pX)){
                            field[pX][pY] = "S2";
                            field[ps1X][ps1Y] = "- ";
                            ps1X = pX;
                            ps1Y = pY;
                            printField( field );
                        } else {
                            System.out.println( "Такой ход невозможен!" );
                            continue;
                        }
                        break;
                    case "Fe":
                        if ((Math.abs( pfY - pY) == Math.abs( pfX - pX))||((pfY - pY == 0) || (pfX - pX == 0))){
                            field[pX][pY] = "Fe";
                            field[pfX][pfY] = "- ";
                            pfX = pX;
                            pfY = pY;
                            printField( field );
                        } else {
                            System.out.println( "Такой ход невозможен!" );
                            continue;
                        }
                        break;
                    case "Ki":
                        if (((Math.abs( pkiY - pY) == Math.abs( pkiX - pX) )&(Math.abs( pkiY - pY) ==1))||(((pkiY - pY == 0) & (Math.abs( pkiX - pX )==1))|| ((Math.abs( pkiY - pY )==1)&(pkiX - pX == 0)))){
                            field[pX][pY] = "Ki";
                            field[pkiX][pkiY] = "- ";
                            pkiX = pX;
                            pkiY = pY;
                            printField( field );
                        } else {
                            System.out.println( "Такой ход невозможен!" );
                            continue;
                        }
                        break;
                        }
                        }

                }



        static void printField(String[][] a) {
            System.out.print( "  " );
            for (char i = 'A'; i <= 'H'; i++) {
                System.out.print( i + "  " );
            }
            System.out.println();
            for (int i = 0; i < a.length; i++) {
                System.out.print( i + 1 + " " );
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print( a[j][i] + " " );
                }
                System.out.println();
            }
        }
    }


