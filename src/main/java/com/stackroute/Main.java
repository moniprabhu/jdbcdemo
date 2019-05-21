package com.stackroute;

import com.stackroute.db.*;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        CrudOperation crudOperation = new CrudOperation();
        crudOperation.displayData();
        crudOperation.displayCustomrerByName("mano","male");
        System.out.println("\n");
        ResultSetMetaDataDemo resultSetMetaDataDemo=new ResultSetMetaDataDemo();
        resultSetMetaDataDemo.resultMeta();
        System.out.println("\n");
        JDBCBatchProcessingDemo jdbcBatchProcessingDemo=new JDBCBatchProcessingDemo();
        jdbcBatchProcessingDemo.batchProcess();
        System.out.println("\n");
        JDBCTransactionDemo jdbcTransactionDemo=new JDBCTransactionDemo();
        jdbcTransactionDemo.transcationProcess();
        System.out.println("\n");
        DatabaseMetaDataDemo databaseMetaDataDemo=new DatabaseMetaDataDemo();
        databaseMetaDataDemo.databaseMetaData();
    }
}
