package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0005R\"\u0010\u001a\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u0005R\u0016\u0010\u001d\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0016\u0010\u001e\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0014R$\u0010%\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "", "p0", "<init>", "(F)V", "p1", "getAcceleration", "(FF)F", "", "init", "()V", "", "p2", "Landroidx/compose/animation/core/Motion;", "updateValues-IJZedt4$animation_core_release", "(FFJ)J", "updateValues", "", "dampedFreq", "D", "dampingRatio", "F", "getDampingRatio", "()F", "setDampingRatio", "finalPosition", "getFinalPosition", "setFinalPosition", "gammaMinus", "gammaPlus", "", "initialized", "Z", "naturalFreq", "getStiffness", "setStiffness", "stiffness"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SpringSimulation {
    public static final int $stable = 8;
    private double dampedFreq;
    private float finalPosition;
    private double gammaMinus;
    private double gammaPlus;
    private boolean initialized;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f) {
        this.finalPosition = f;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final void setFinalPosition(float f) {
        this.finalPosition = f;
    }

    public final void setStiffness(float f) {
        if (getStiffness() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f);
        this.initialized = false;
    }

    public final float getStiffness() {
        double d = this.naturalFreq;
        return (float) (d * d);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final void setDampingRatio(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f;
        this.initialized = false;
    }

    public final float getAcceleration(float p0, float p1) {
        float f = this.finalPosition;
        double d = this.naturalFreq;
        return (float) (((-(d * d)) * ((double) (p0 - f))) - (((d * 2.0d) * ((double) this.dampingRatio)) * ((double) p1)));
    }

    private final void init() {
        if (this.initialized) {
            return;
        }
        if (this.finalPosition == SpringSimulationKt.getUNSET()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f = this.dampingRatio;
        double d = f;
        double d2 = d * d;
        if (f > 1.0f) {
            double d3 = this.naturalFreq;
            double d4 = d2 - 1.0d;
            this.gammaPlus = (((double) (-f)) * d3) + (d3 * Math.sqrt(d4));
            double d5 = -this.dampingRatio;
            double d6 = this.naturalFreq;
            this.gammaMinus = (d5 * d6) - (d6 * Math.sqrt(d4));
        } else if (f >= 0.0f && f < 1.0f) {
            this.dampedFreq = this.naturalFreq * Math.sqrt(1.0d - d2);
        }
        this.initialized = true;
    }

    /* JADX INFO: renamed from: updateValues-IJZedt4$animation_core_release, reason: not valid java name */
    public final long m491updateValuesIJZedt4$animation_core_release(float p0, float p1, long p2) {
        double dExp;
        double dCos;
        init();
        float f = p0 - this.finalPosition;
        double d = p2 / 1000.0d;
        float f2 = this.dampingRatio;
        if (f2 > 1.0f) {
            double d2 = f;
            double d3 = this.gammaMinus;
            double d4 = ((d3 * d2) - ((double) p1)) / (d3 - this.gammaPlus);
            double d5 = d2 - d4;
            dExp = (Math.exp(d3 * d) * d5) + (Math.exp(this.gammaPlus * d) * d4);
            double d6 = this.gammaMinus;
            double dExp2 = Math.exp(d6 * d);
            double d7 = this.gammaPlus;
            dCos = (d5 * d6 * dExp2) + (d4 * d7 * Math.exp(d7 * d));
        } else if (f2 == 1.0f) {
            double d8 = this.naturalFreq;
            double d9 = f;
            double d10 = ((double) p1) + (d8 * d9);
            double d11 = d9 + (d10 * d);
            double dExp3 = Math.exp((-d8) * d);
            double dExp4 = Math.exp((-this.naturalFreq) * d);
            double d12 = -this.naturalFreq;
            dCos = (d10 * Math.exp(d12 * d)) + (dExp4 * d11 * d12);
            dExp = d11 * dExp3;
        } else {
            double d13 = 1.0d / this.dampedFreq;
            double d14 = this.naturalFreq;
            double d15 = f;
            double d16 = d13 * ((((double) f2) * d14 * d15) + ((double) p1));
            dExp = Math.exp(((double) (-f2)) * d14 * d) * ((Math.cos(this.dampedFreq * d) * d15) + (Math.sin(this.dampedFreq * d) * d16));
            double d17 = this.naturalFreq;
            float f3 = this.dampingRatio;
            double d18 = f3;
            double dExp5 = Math.exp(((double) (-f3)) * d17 * d);
            double d19 = this.dampedFreq;
            double d20 = -d19;
            double dSin = Math.sin(d19 * d);
            double d21 = this.dampedFreq;
            dCos = (((d20 * d15 * dSin) + (d16 * d21 * Math.cos(d21 * d))) * dExp5) + ((-d17) * dExp * d18);
        }
        return SpringSimulationKt.Motion((float) (dExp + ((double) this.finalPosition)), (float) dCos);
    }
}
