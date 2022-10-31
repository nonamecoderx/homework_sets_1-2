package table;

import java.util.Objects;

public class Task {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return value1 == task.value1 && value2 == task.value2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2);
    }

    private final int value1;
    private final int value2;

    public Task(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    @Override
    public String toString() {
        return String.format("%s*%s=?",
                this.value1,this.value2);
    }

}
