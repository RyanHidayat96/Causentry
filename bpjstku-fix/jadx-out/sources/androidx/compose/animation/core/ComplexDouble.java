package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0014\u0010\rJ\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0016\u0010\rJ\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0017\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0011\u0010!\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b \u0010\bR\u0011\u0010#\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\"\u0010\b"}, d2 = {"Landroidx/compose/animation/core/ComplexDouble;", "", "", "p0", "p1", "<init>", "(DD)V", "component1", "()D", "component2", "copy", "(DD)Landroidx/compose/animation/core/ComplexDouble;", "div", "(D)Landroidx/compose/animation/core/ComplexDouble;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "minus", "(Landroidx/compose/animation/core/ComplexDouble;)Landroidx/compose/animation/core/ComplexDouble;", "plus", "times", "", "toString", "()Ljava/lang/String;", "unaryMinus", "()Landroidx/compose/animation/core/ComplexDouble;", "_imaginary", "D", "_real", "getImaginary", "imaginary", "getReal", "real"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ComplexDouble {
    public static final int $stable = 8;
    private double _imaginary;
    private double _real;

    public ComplexDouble(double d, double d2) {
        this._real = d;
        this._imaginary = d2;
    }

    public final double getReal() {
        return this._real;
    }

    public final double getImaginary() {
        return this._imaginary;
    }

    public final ComplexDouble plus(double p0) {
        this._real += p0;
        return this;
    }

    public final ComplexDouble plus(ComplexDouble p0) {
        this._real += p0.getReal();
        this._imaginary += p0.getImaginary();
        return this;
    }

    public final ComplexDouble times(double p0) {
        this._real *= p0;
        this._imaginary *= p0;
        return this;
    }

    public final ComplexDouble times(ComplexDouble p0) {
        this._real = (getReal() * p0.getReal()) - (getImaginary() * p0.getImaginary());
        this._imaginary = (getReal() * p0.getImaginary()) + (p0.getReal() * getImaginary());
        return this;
    }

    public final ComplexDouble unaryMinus() {
        this._real *= -1.0d;
        this._imaginary *= -1.0d;
        return this;
    }

    public final ComplexDouble div(double p0) {
        this._real /= p0;
        this._imaginary /= p0;
        return this;
    }

    public final ComplexDouble minus(double p0) {
        this._real += -p0;
        return this;
    }

    public final ComplexDouble minus(ComplexDouble p0) {
        p0._real *= -1.0d;
        p0._imaginary *= -1.0d;
        this._real += p0.getReal();
        this._imaginary += p0.getImaginary();
        return this;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final double get_real() {
        return this._real;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final double get_imaginary() {
        return this._imaginary;
    }

    public static /* synthetic */ ComplexDouble copy$default(ComplexDouble complexDouble, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = complexDouble._real;
        }
        if ((i & 2) != 0) {
            d2 = complexDouble._imaginary;
        }
        return complexDouble.copy(d, d2);
    }

    public final ComplexDouble copy(double p0, double p1) {
        return new ComplexDouble(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ComplexDouble)) {
            return false;
        }
        ComplexDouble complexDouble = (ComplexDouble) p0;
        return Double.compare(this._real, complexDouble._real) == 0 && Double.compare(this._imaginary, complexDouble._imaginary) == 0;
    }

    public final int hashCode() {
        return (Double.hashCode(this._real) * 31) + Double.hashCode(this._imaginary);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComplexDouble(_real=");
        sb.append(this._real);
        sb.append(", _imaginary=");
        sb.append(this._imaginary);
        sb.append(')');
        return sb.toString();
    }
}
