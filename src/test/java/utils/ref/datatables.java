//package utils.ref;
//import java.util.List;
//import java.util.Map;
//
//import io.cucumber.datatable.DataTable;
//public class datatables {
////
////	Method	Returns	Use When
////	row(0)	List<String>	Need one specific row
////	rows()	List<List<String>>	Need all rows
////	cell(0,0)	String	Need one cell
////	column(0)	List<String>	Need one column
////	columns()	List<List<String>>	Need all columns
////	asList()	List<String>	One-dimensional list
////	asLists()	List<List<String>>	Multiple rows/columns
////	asMap()	Map<String,String>	One key-value dataset
////	asMaps()	List<Map<String,String>>	Header + multiple records
////	entrySet()	Set<Map.Entry<K,V>>	Iterate Map keys + values
////	keySet()	Set<K>	Iterate Map keys
////	values()	Collection<V>	Iterate Map values
//
//	/**
//	 * ============================================================
//	 * CUCUMBER DATATABLE - COMPLETE REFERENCE
//	 * ============================================================
//	 *
//	 * DataTable is provided by Cucumber:
//	 *
//	 * import io.cucumber.datatable.DataTable;
//	 *
//	 * DataTable is used to receive tables written in a
//	 * Cucumber Feature file.
//	 *
//	 * Example:
//	 *
//	 * When user enters registration details
//	 *   | FirstName | LastName | Email            |
//	 *   | Ganesh    | Kumar    | ganesh@gmail.com |
//	 *
//	 * Step Definition:
//	 *
//	 * public void enterRegistrationDetails(DataTable dataTable)
//	 *
//	 * Cucumber passes the Feature file table into the
//	 * DataTable object.
//	 *
//	 * ============================================================
//	 *
//	 * IMPORTANT METHODS
//	 *
//	 * 1. row()
//	 * 2. rows()
//	 * 3. cell()
//	 * 4. cells()
//	 * 5. column()
//	 * 6. columns()
//	 * 7. asList()
//	 * 8. asLists()
//	 * 9. asMap()
//	 * 10. asMaps()
//	 *
//	 * After converting DataTable to Map:
//	 *
//	 * 11. get()
//	 * 12. keySet()
//	 * 13. values()
//	 * 14. entrySet()
//	 *
//	 * ============================================================
//	 */
//
//	public class DataTables {
//
//
//	    // ============================================================
//	    // 1. row()
//	    // ============================================================
//	    /*
//	     * row() returns one specific row.
//	     *
//	     * Feature:
//	     *
//	     * | Ganesh | Kumar  | ganesh@gmail.com |
//	     * | Ravi   | Sharma | ravi@gmail.com   |
//	     *
//	     * row(0) -> first row
//	     * row(1) -> second row
//	     *
//	     * Return type:
//	     *
//	     * List<String>
//	     */
//
//	    public void rowExample(DataTable dataTable) {
//
//	        List<String> firstRow =
//	                dataTable.row(0);
//
//	        System.out.println("First row:");
//	        System.out.println(firstRow);
//
//	        /*
//	         * Access individual values
//	         */
//
//	        System.out.println(
//	                "First Name: " + firstRow.get(0)
//	        );
//
//	        System.out.println(
//	                "Last Name: " + firstRow.get(1)
//	        );
//
//	        System.out.println(
//	                "Email: " + firstRow.get(2)
//	        );
//	    }
//
//
//	    // ============================================================
//	    // 2. rows()
//	    // ============================================================
//	    /*
//	     * rows() returns all rows.
//	     *
//	     * Return type:
//	     *
//	     * List<List<String>>
//	     */
//
//	    public void rowsExample(DataTable dataTable) {
//
//	        List<List<String>> rows =
//	                dataTable.rows();
//
//	        for (List<String> row : rows) {
//
//	            System.out.println(row);
//	        }
//	    }
//
//
//	    // ============================================================
//	    // 3. cell()
//	    // ============================================================
//	    /*
//	     * cell(row, column)
//	     *
//	     * Returns one particular cell.
//	     *
//	     * Example:
//	     *
//	     * | Ganesh | Kumar |
//	     * | Ravi   | Sharma|
//	     *
//	     * cell(0,0) -> Ganesh
//	     * cell(0,1) -> Kumar
//	     * cell(1,0) -> Ravi
//	     * cell(1,1) -> Sharma
//	     *
//	     * Return type:
//	     *
//	     * String
//	     */
//
//	    public void cellExample(DataTable dataTable) {
//
//	        String value =
//	                dataTable.cell(0, 1);
//
//	        System.out.println(
//	                "Selected cell: " + value
//	        );
//	    }
//
//
//	    // ============================================================
//	    // 4. cells()
//	    // ============================================================
//	    /*
//	     * cells() provides the complete table
//	     * as rows and cells.
//	     *
//	     * Return type:
//	     *
//	     * List<List<String>>
//	     */
//
//	    public void cellsExample(DataTable dataTable) {
//
//	        List<List<String>> cells =
//	                dataTable.cells();
//
//	        for (List<String> row : cells) {
//
//	            System.out.println(row);
//	        }
//	    }
//
//
//	    // ============================================================
//	    // 5. column()
//	    // ============================================================
//	    /*
//	     * column() returns one specific column.
//	     *
//	     * Example:
//	     *
//	     * | Ganesh | Kumar  |
//	     * | Ravi   | Sharma |
//	     * | John   | Smith  |
//	     *
//	     * column(0)
//	     *
//	     * -> Ganesh
//	     * -> Ravi
//	     * -> John
//	     *
//	     * Return type:
//	     *
//	     * List<String>
//	     */
//
//	    public void columnExample(DataTable dataTable) {
//
//	        List<String> firstColumn =
//	                dataTable.column(0);
//
//	        System.out.println(
//	                "First column: " + firstColumn
//	        );
//	    }
//
//
//	    // ============================================================
//	    // 6. columns()
//	    // ============================================================
//	    /*
//	     * columns() returns all columns.
//	     *
//	     * Return type:
//	     *
//	     * List<List<String>>
//	     */
//
//	    public void columnsExample(DataTable dataTable) {
//
//	        List<List<String>> columns =
//	                dataTable.columns();
//
//	        for (List<String> column : columns) {
//
//	            System.out.println(column);
//	        }
//	    }
//
//
//	    // ============================================================
//	    // 7. asList()
//	    // ============================================================
//	    /*
//	     * asList() is useful when the DataTable represents
//	     * a simple one-dimensional list.
//	     *
//	     * Feature:
//	     *
//	     * | Laptop  |
//	     * | Mouse   |
//	     * | Keyboard|
//	     *
//	     * Java:
//	     *
//	     * List<String> products =
//	     *         dataTable.asList();
//	     *
//	     * Return type:
//	     *
//	     * List<String>
//	     */
//
//	    public void asListExample(DataTable dataTable) {
//
//	        List<String> products =
//	                dataTable.asList();
//
//	        for (String product : products) {
//
//	            System.out.println(
//	                    "Product: " + product
//	            );
//	        }
//	    }
//
//
//	    // ============================================================
//	    // 8. asLists()
//	    // ============================================================
//	    /*
//	     * asLists() is useful when the DataTable contains
//	     * multiple rows and multiple columns.
//	     *
//	     * Feature:
//	     *
//	     * | Ganesh | Kumar  | ganesh@gmail.com |
//	     * | Ravi   | Sharma | ravi@gmail.com   |
//	     *
//	     * Return type:
//	     *
//	     * List<List<String>>
//	     */
//
//	    public void asListsExample(DataTable dataTable) {
//
//	        List<List<String>> users =
//	                dataTable.asLists();
//
//	        for (List<String> user : users) {
//
//	            System.out.println(
//	                    "First Name: " + user.get(0)
//	            );
//
//	            System.out.println(
//	                    "Last Name: " + user.get(1)
//	            );
//
//	            System.out.println(
//	                    "Email: " + user.get(2)
//	            );
//	        }
//	    }
//
//
//	    // ============================================================
//	    // 9. asMap()
//	    // ============================================================
//	    /*
//	     * asMap() is used when the DataTable contains
//	     * one set of key-value pairs.
//	     *
//	     * Feature:
//	     *
//	     * | FirstName | Ganesh           |
//	     * | LastName  | Kumar            |
//	     * | Email     | ganesh@gmail.com |
//	     *
//	     * Return type:
//	     *
//	     * Map<String, String>
//	     */
//
//	    public void asMapExample(DataTable dataTable) {
//
//	        Map<String, String> data =
//	                dataTable.asMap();
//
//	        System.out.println(
//	                "First Name: "
//	                + data.get("FirstName")
//	        );
//
//	        System.out.println(
//	                "Last Name: "
//	                + data.get("LastName")
//	        );
//
//	        System.out.println(
//	                "Email: "
//	                + data.get("Email")
//	        );
//	    }
//
//
//	    // ============================================================
//	    // 10. asMaps()
//	    // ============================================================
//	    /*
//	     * asMaps() is one of the most useful methods for
//	     * tabular test data.
//	     *
//	     * Feature:
//	     *
//	     * | FirstName | LastName | Email            |
//	     * | Ganesh    | Kumar    | ganesh@gmail.com |
//	     * | Ravi      | Sharma   | ravi@gmail.com   |
//	     * | John      | Smith    | john@gmail.com   |
//	     *
//	     * First row = headers
//	     *
//	     * Each following row = one record
//	     *
//	     * Return type:
//	     *
//	     * List<Map<String, String>>
//	     */
//
//	    public void asMapsExample(DataTable dataTable) {
//
//	        List<Map<String, String>> users =
//	                dataTable.asMaps();
//
//	        for (Map<String, String> user : users) {
//
//	            System.out.println(
//	                    "First Name: "
//	                    + user.get("FirstName")
//	            );
//
//	            System.out.println(
//	                    "Last Name: "
//	                    + user.get("LastName")
//	            );
//
//	            System.out.println(
//	                    "Email: "
//	                    + user.get("Email")
//	            );
//
//	            System.out.println("--------------------");
//	        }
//	    }
//
//
//	    // ============================================================
//	    // 11. asMaps().get(0)
//	    // ============================================================
//	    /*
//	     * This is very common when the DataTable contains
//	     * only ONE data record.
//	     *
//	     * Feature:
//	     *
//	     * | FirstName | LastName | Email            |
//	     * | Ganesh    | Kumar    | ganesh@gmail.com |
//	     *
//	     * asMaps()
//	     *
//	     * returns:
//	     *
//	     * List<Map<String,String>>
//	     *
//	     * get(0)
//	     *
//	     * gets the first Map.
//	     */
//
//	    public void firstRecordExample(DataTable dataTable) {
//
//	        Map<String, String> data =
//	                dataTable.asMaps().get(0);
//
//	        System.out.println(
//	                data.get("FirstName")
//	        );
//
//	        System.out.println(
//	                data.get("LastName")
//	        );
//
//	        System.out.println(
//	                data.get("Email")
//	        );
//	    }
//
//
//	    // ============================================================
//	    // 12. Map.get()
//	    // ============================================================
//	    /*
//	     * get() is NOT a DataTable method.
//	     *
//	     * It belongs to Java Map.
//	     *
//	     * Example:
//	     *
//	     * Map<String,String> data =
//	     *         dataTable.asMap();
//	     *
//	     * data.get("FirstName")
//	     *
//	     * returns:
//	     *
//	     * Ganesh
//	     */
//
//	    public void mapGetExample(DataTable dataTable) {
//
//	        Map<String, String> data =
//	                dataTable.asMap();
//
//	        String firstName =
//	                data.get("FirstName");
//
//	        System.out.println(firstName);
//	    }
//
//
//	    // ============================================================
//	    // 13. Map.keySet()
//	    // ============================================================
//	    /*
//	     * keySet() belongs to Java Map.
//	     *
//	     * It returns all keys.
//	     *
//	     * Example:
//	     *
//	     * FirstName
//	     * LastName
//	     * Email
//	     */
//
//	    public void keySetExample(DataTable dataTable) {
//
//	        Map<String, String> data =
//	                dataTable.asMap();
//
//	        for (String key : data.keySet()) {
//
//	            System.out.println(
//	                    "Key: " + key
//	            );
//	        }
//	    }
//
//
//	    // ============================================================
//	    // 14. Map.values()
//	    // ============================================================
//	    /*
//	     * values() belongs to Java Map.
//	     *
//	     * It returns all values.
//	     *
//	     * Example:
//	     *
//	     * Ganesh
//	     * Kumar
//	     * ganesh@gmail.com
//	     */
//
//	    public void valuesExample(DataTable dataTable) {
//
//	        Map<String, String> data =
//	                dataTable.asMap();
//
//	        for (String value : data.values()) {
//
//	            System.out.println(
//	                    "Value: " + value
//	            );
//	        }
//	    }
//
//
//	    // ============================================================
//	    // 15. Map.entrySet()
//	    // ============================================================
//	    /*
//	     * IMPORTANT:
//	     *
//	     * entrySet() does NOT belong to DataTable.
//	     *
//	     * It belongs to Java Map.
//	     *
//	     * It is used when we want both:
//	     *
//	     * Key + Value
//	     *
//	     * Example:
//	     *
//	     * FirstName = Ganesh
//	     * LastName  = Kumar
//	     * Email     = ganesh@gmail.com
//	     */
//
//	    public void entrySetExample(DataTable dataTable) {
//
//	        Map<String, String> data =
//	                dataTable.asMap();
//
//	        for (Map.Entry<String, String> entry :
//	                data.entrySet()) {
//
//	            System.out.println(
//	                    entry.getKey()
//	                    + " = "
//	                    + entry.getValue()
//	            );
//	        }
//	    }
//
//
//	    // ============================================================
//	    // 16. Multiple records using asMaps()
//	    // ============================================================
//	    /*
//	     * This is a very common real-world example.
//	     *
//	     * Feature:
//	     *
//	     * | FirstName | LastName | Email            |
//	     * | Ganesh    | Kumar    | ganesh@gmail.com |
//	     * | Ravi      | Sharma   | ravi@gmail.com   |
//	     * | John      | Smith    | john@gmail.com   |
//	     */
//
//	    public void multipleUsersExample(
//	            DataTable dataTable) {
//
//	        List<Map<String, String>> users =
//	                dataTable.asMaps();
//
//	        for (Map<String, String> user : users) {
//
//	            String firstName =
//	                    user.get("FirstName");
//
//	            String lastName =
//	                    user.get("LastName");
//
//	            String email =
//	                    user.get("Email");
//
//	            System.out.println(
//	                    firstName + " "
//	                    + lastName + " "
//	                    + email
//	            );
//	        }
//	    }
//
//
//	    // ============================================================
//	    // 17. DataTable Selection Guide
//	    // ============================================================
//	    /*
//	     *
//	     * ONE CELL
//	     *
//	     * dataTable.cell(0, 1);
//	     *
//	     *
//	     * ONE ROW
//	     *
//	     * dataTable.row(0);
//	     *
//	     *
//	     * ALL ROWS
//	     *
//	     * dataTable.rows();
//	     *
//	     *
//	     * ONE COLUMN
//	     *
//	     * dataTable.column(0);
//	     *
//	     *
//	     * ALL COLUMNS
//	     *
//	     * dataTable.columns();
//	     *
//	     *
//	     * SIMPLE ONE-DIMENSIONAL LIST
//	     *
//	     * dataTable.asList();
//	     *
//	     *
//	     * MULTIPLE ROWS/COLUMNS
//	     *
//	     * dataTable.asLists();
//	     *
//	     *
//	     * ONE KEY-VALUE DATASET
//	     *
//	     * dataTable.asMap();
//	     *
//	     *
//	     * HEADER + MULTIPLE RECORDS
//	     *
//	     * dataTable.asMaps();
//	     *
//	     */
//
//
//	    // ============================================================
//	    // 18. QUICK REFERENCE
//	    // ============================================================
//	    /*
//	     *
//	     * ------------------------------------------------------------
//	     * Method             Return Type
//	     * ------------------------------------------------------------
//	     *
//	     * row(0)             List<String>
//	     *
//	     * rows()             List<List<String>>
//	     *
//	     * cell(0,0)          String
//	     *
//	     * cells()            List<List<String>>
//	     *
//	     * column(0)          List<String>
//	     *
//	     * columns()          List<List<String>>
//	     *
//	     * asList()           List<String>
//	     *
//	     * asLists()          List<List<String>>
//	     *
//	     * asMap()            Map<String,String>
//	     *
//	     * asMaps()           List<Map<String,String>>
//	     *
//	     * ------------------------------------------------------------
//	     */
//
//
//	    // ============================================================
//	    // 19. MEMORY TRICK
//	    // ============================================================
//	    /*
//	     *
//	     * asList()
//	     *      |
//	     *      +---- List<String>
//	     *
//	     *
//	     * asLists()
//	     *      |
//	     *      +---- List<List<String>>
//	     *
//	     *
//	     * asMap()
//	     *      |
//	     *      +---- Map<String,String>
//	     *
//	     *
//	     * asMaps()
//	     *      |
//	     *      +---- List<Map<String,String>>
//	     *
//	     *
//	     * Remember:
//	     *
//	     * LIST  = one list
//	     * LISTS = list of lists
//	     *
//	     * MAP   = one map
//	     * MAPS  = list of maps
//	     *
//	     */
//
//
//	    // ============================================================
//	    // 20. COMPLETE REGISTRATION EXAMPLE
//	    // ============================================================
//	    /*
//	     *
//	     * FEATURE FILE:
//	     *
//	     * Scenario: Register user
//	     *
//	     *   When user enters registration details
//	     *     | FirstName | LastName | Email            |
//	     *     | Ganesh    | Kumar    | ganesh@gmail.com |
//	     *
//	     *
//	     * STEP DEFINITION:
//	     *
//	     * @When("user enters registration details")
//	     * public void enterRegistrationDetails(
//	     *         DataTable dataTable) {
//	     *
//	     *     Map<String, String> data =
//	     *             dataTable.asMaps().get(0);
//	     *
//	     *     System.out.println(
//	     *             data.get("FirstName"));
//	     *
//	     *     System.out.println(
//	     *             data.get("LastName"));
//	     *
//	     *     System.out.println(
//	     *             data.get("Email"));
//	     * }
//	     *
//	     *
//	     * DataTable comes from Cucumber:
//	     *
//	     * import io.cucumber.datatable.DataTable;
//	     *
//	     *
//	     * ============================================================
//	     */
//
//
//	    // ============================================================
//	    // 21. IMPORTANT DIFFERENCE
//	    // ============================================================
//	    /*
//	     *
//	     * DataTable methods:
//	     *
//	     * row()
//	     * rows()
//	     * cell()
//	     * cells()
//	     * column()
//	     * columns()
//	     * asList()
//	     * asLists()
//	     * asMap()
//	     * asMaps()
//	     *
//	     *
//	     * Java Map methods:
//	     *
//	     * get()
//	     * keySet()
//	     * values()
//	     * entrySet()
//	     *
//	     *
//	     * Therefore:
//	     *
//	     * dataTable.asMap()
//	     *        ↓
//	     * Map<String,String>
//	     *        ↓
//	     * map.entrySet()
//	     *
//	     *
//	     * entrySet() is NOT:
//	     *
//	     * dataTable.entrySet()
//	     *
//	     * ============================================================
//	     */
//
//
//	    // ============================================================
//	    // 22. FINAL DECISION TREE
//	    // ============================================================
//	    /*
//	     *
//	     * Need one cell?
//	     *      ↓
//	     * cell()
//	     *
//	     * Need one row?
//	     *      ↓
//	     * row()
//	     *
//	     * Need one column?
//	     *      ↓
//	     * column()
//	     *
//	     * Need a simple list?
//	     *      ↓
//	     * asList()
//	     *
//	     * Need multiple rows/columns?
//	     *      ↓
//	     * asLists()
//	     *
//	     * Need one key-value dataset?
//	     *      ↓
//	     * asMap()
//	     *
//	     * Need header + multiple records?
//	     *      ↓
//	     * asMaps()
//	     *
//	     * Already have a Map and need
//	     * keys + values?
//	     *      ↓
//	     * entrySet()
//	     *
//	     */
//	}
//
//
//}
