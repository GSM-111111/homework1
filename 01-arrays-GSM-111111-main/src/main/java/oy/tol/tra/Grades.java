package oy.tol.tra;

/**
 * 包装 Integer 数组，提供反转和排序的实例方法（委托给 Algorithms 类）。
 */
public class Grades {
    private Integer[] grades;

    public Grades(Integer[] grades) {
        this.grades = grades; // 直接引用原数组，原地修改
    }

    public void reverse() {
        Algorithms.reverse(grades);
    }

    public void sort() {
        Algorithms.sort(grades);
    }

    public Integer[] getArray() {
        return grades;
    }
}