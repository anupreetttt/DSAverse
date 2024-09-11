package DataStructure.BackTracking;

import java.util.ArrayList;

public class maze {

//    public static void main(String[] args) {
//
////        maze("", 3, 3);
//
//        mazeDiagonally("", 3, 3 );
//
////        System.out.println(mazeRet("", 3, 3));
//    }
//
//    static void maze(String p, int row, int column) {
//
//        if(row == 1 && column == 1) {
//            System.out.println(p);
//            return;
//        }
//
//        if(row > 1) {
//            maze(p + "d", row - 1, column);
//        }
//
//        if(column > 1) {
//            maze(p + "r", row, column - 1 );
//        }
//    }
//
//    static void mazeDiagonally(String p, int row, int column) {
//
//        if(row == 1 && column == 1) {
//            System.out.println(p);
//            return;
//        }
//
//        if(row > 1) {
//            mazeDiagonally(p + "V", row - 1, column);
//        }
//
//        if(column > 1) {
//            mazeDiagonally(p + "H", row, column - 1);
//        }
//        if(row > 1 && column > 1) {
//            mazeDiagonally(p + "D", row - 1, column - 1);
//        }
//    }
//    static ArrayList<String> mazeRet(String p, int row, int column) {
//
//        if(row == 1 && column == 1) {
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//
//        ArrayList<String> list = new ArrayList<>();
//
//        if(row > 1) {
//            list.addAll(mazeRet(p + "D", row - 1, column));
//        }
//
//        if(column > 1) {
//            list.addAll(mazeRet(p + "R", row, column - 1 ));
//        }
//
//        return list;
//    }


        public static void main(String[] args) {
            String StrRates = "5.0,25.5,101,6.0,102:L10;5.0,99,5.5,100,6.0,101:L20;";
            String[][] matrix = parseStrRates(StrRates);

            // Display the matrix as an HTML table
            displayMatrixAsHTML(matrix);
        }

        public static String[][] parseStrRates(String StrRates) {
            String[] entries = StrRates.split(";");
            int numEntries = entries.length;
            String[][] matrix = new String[numEntries][];
            int maxLength = 0;

            for (int i = 0; i < numEntries; i++) {
                String entry = entries[i];
                String[] parts = entry.split(":");
                String[] rates = parts[0].split(",");
                String[] prices = parts[1].split(",");

                int entryLength = rates.length + prices.length + 1;
                if (entryLength > maxLength) {
                    maxLength = entryLength;
                }

                String[] row = new String[entryLength];
                int index = 0;

                for (String rate : rates) {
                    row[index++] = rate.trim();
                }

                for (String price : prices) {
                    row[index++] = price.trim();
                }

                matrix[i] = row;
            }

            // Pad the rows with empty strings if necessary
            for (String[] row : matrix) {
                if (row.length < maxLength) {
                    String[] paddedRow = new String[maxLength];
                    System.arraycopy(row, 0, paddedRow, 0, row.length);
                    matrix[row.length - 1] = paddedRow;
                }
            }

            return matrix;
        }

        public static void displayMatrixAsHTML(String[][] matrix) {
            StringBuilder html = new StringBuilder();
            html.append("<html><body><table>");

            for (String[] row : matrix) {
                html.append("<tr>");

                for (String cell : row) {
                    html.append("<td>").append(cell).append("</td>");
                }

                html.append("</tr>");
            }

            html.append("</table></body></html>");

            System.out.println(html.toString());
        }

}