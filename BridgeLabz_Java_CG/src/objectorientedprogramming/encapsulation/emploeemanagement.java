package objectorientedprogramming.encapsulation;

import java.util.*;

interface Dept {
    void setDept(String deptName);
    String getDept();
}

abstract class Emp {
    private int empId;
    private String empName;
    private double baseSal;

    Emp(int empId, String empName, double baseSal) {
        this.empId = empId;
        this.empName = empName;
        this.baseSal = baseSal;
    }

    int getEmpId() { return empId; }
    void setEmpId(int empId) { this.empId = empId; }

    String getEmpName() { return empName; }
    void setEmpName(String empName) { this.empName = empName; }

    double getBaseSal() { return baseSal; }
    void setBaseSal(double baseSal) { this.baseSal = baseSal; }

    abstract double calcSal();

    void show() {
        System.out.println(empId + " " + empName + " " + calcSal());
    }
}

class FullEmp extends Emp implements Dept {
    private String deptName;

    FullEmp(int empId, String empName, double baseSal) {
        super(empId, empName, baseSal);
    }

    double calcSal() {
        return getBaseSal();
    }

    public void setDept(String deptName) {
        this.deptName = deptName;
    }

    public String getDept() {
        return deptName;
    }
}

class PartEmp extends Emp implements Dept {
    private int workHrs;
    private double hrRate;
    private String deptName;

    PartEmp(int empId, String empName, int workHrs, double hrRate) {
        super(empId, empName, 0);
        this.workHrs = workHrs;
        this.hrRate = hrRate;
    }

    double calcSal() {
        return workHrs * hrRate;
    }

    public void setDept(String deptName) {
        this.deptName = deptName;
    }

    public String getDept() {
        return deptName;
    }
}

public class emploeemanagement {
    public static void main(String[] args) {
        List<Emp> empList = new ArrayList<>();

        Emp fe = new FullEmp(101, "Anu", 45000);
        Emp pe = new PartEmp(102, "Bala", 100, 250);

        ((Dept) fe).setDept("HR");
        ((Dept) pe).setDept("IT");

        empList.add(fe);
        empList.add(pe);

        for (Emp e : empList)
            e.show();
    }
}
