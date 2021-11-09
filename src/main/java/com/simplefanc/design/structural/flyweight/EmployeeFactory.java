package com.simplefanc.design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {

    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department, String name) {
        //根据部门获取部门经理
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        //将部门经理放进map池中，创建一次  下次需要的时候可以直接从池中取
        if (manager == null) {
            manager = new Manager(department);
            System.out.print("创建" + department + "部门经理");
            manager.setName(name);
            String reportContent = department + "部门汇报：此次报告的主要内容是......";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告：" + reportContent);
            EMPLOYEE_MAP.put(department, manager);
        } else {
            manager.setName(name);
        }
        return manager;
    }
}
