public class Excel_sheets_column_number {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            result.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }
}
