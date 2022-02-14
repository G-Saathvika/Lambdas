package com.lambdas;

@java.lang.FunctionalInterface
interface Employee{
    com.functions.biconsumer.Employee find(int id);

    //default method
    default boolean isExec(int id){
        return true;
    }

    //static method
    static String getDefaultCountry(){
        return "UK";
    }
}

public class DefaultStaticMethods {
    public static void main(String[] args) {
        class EmployeeImpl implements Employee {

            @Override
            public com.functions.biconsumer.Employee find(int id){
                boolean executive = isExec(id);
                return null;
            }
        }

        EmployeeImpl impl = new EmployeeImpl();
        impl.isExec(1234);

        String defaultCountry = Employee.getDefaultCountry();
    }
}
