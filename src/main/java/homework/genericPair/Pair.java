package homework.genericPair;

import java.util.Objects;

class Pair<A, B> {

    private A a;
    private B b;

    private Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public A getFirst() {
        return a;
    }

    public B getSecond() {
        return b;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 first, T2 second) {
        return new Pair<>(first, second);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        if (a != null) result = prime * result + a.hashCode();
        if (b != null) result = prime * result + b.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair<?, ?> other = (Pair<?, ?>) obj;
        return Objects.equals(a, other.getFirst()) && Objects.equals(b, other.getSecond());
    }
}