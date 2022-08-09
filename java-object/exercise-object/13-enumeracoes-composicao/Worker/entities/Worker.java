package entities;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // Associações
    private Department department;
    private List <HourContract> contracts = new ArrayList<>();

    public Worker() {
    }
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public WorkerLevel getLevel() {
        return level;
    }
    public void setLevel(WorkerLevel level) {
        this.level = level;
    }
    public Double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

    // Metodos
    public void addContract (HourContract contract){
        contracts.add(contract);
    }
    public void removeContract (HourContract contract){
        contracts.remove(contract);
    }

    public Double income (int year, int month) {
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();

        for (HourContract c : contracts) {
            calendar.setTime(c.getDate());
            int c_Year = calendar.get(Calendar.YEAR);
            int c_Month = calendar.get(Calendar.MONTH) +1; // Calendar start by default at zero
            if (c_Year == year && c_Month == month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
