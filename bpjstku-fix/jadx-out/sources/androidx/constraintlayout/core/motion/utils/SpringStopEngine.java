package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes5.dex */
public class SpringStopEngine implements StopEngine {
    private static final double UNSET = Double.MAX_VALUE;
    private float mLastTime;
    private double mLastVelocity;
    private float mMass;
    private float mPos;
    private double mStiffness;
    private float mStopThreshold;
    private double mTargetPos;
    private float mV;
    double mDamping = 0.5d;
    private boolean mInitialized = false;
    private int mBoundaryMode = 0;

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f) {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return 0.0f;
    }

    void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sb = new StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(") ");
        sb.append(stackTraceElement.getMethodName());
        sb.append("() ");
        String string = sb.toString();
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(str);
        printStream.println(sb2.toString());
    }

    public void springConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.mTargetPos = f2;
        this.mDamping = f6;
        this.mInitialized = false;
        this.mPos = f;
        this.mLastVelocity = f3;
        this.mStiffness = f5;
        this.mMass = f4;
        this.mStopThreshold = f7;
        this.mBoundaryMode = i;
        this.mLastTime = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f) {
        return this.mV;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        compute(f - this.mLastTime);
        this.mLastTime = f;
        if (isStopped()) {
            this.mPos = (float) this.mTargetPos;
        }
        return this.mPos;
    }

    public float getAcceleration() {
        return ((float) (((-this.mStiffness) * (((double) this.mPos) - this.mTargetPos)) - (this.mDamping * ((double) this.mV)))) / this.mMass;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        double d = ((double) this.mPos) - this.mTargetPos;
        double d2 = this.mStiffness;
        double d3 = this.mV;
        return Math.sqrt((((d3 * d3) * ((double) this.mMass)) + ((d2 * d) * d)) / d2) <= ((double) this.mStopThreshold);
    }

    private void compute(double d) {
        if (d > 0.0d) {
            double d2 = this.mStiffness;
            double d3 = this.mDamping;
            int iSqrt = (int) ((9.0d / ((Math.sqrt(d2 / ((double) this.mMass)) * d) * 4.0d)) + 1.0d);
            double d4 = d / ((double) iSqrt);
            int i = 0;
            while (i < iSqrt) {
                float f = this.mPos;
                double d5 = f;
                double d6 = this.mTargetPos;
                int i2 = iSqrt;
                float f2 = this.mV;
                int i3 = i;
                double d7 = f2;
                double d8 = ((-d2) * (d5 - d6)) - (d7 * d3);
                double d9 = d3;
                double d10 = this.mMass;
                double d11 = (((d8 / d10) * d4) / 2.0d) + d7;
                double d12 = ((((-((d5 + ((d4 * d11) / 2.0d)) - d6)) * d2) - (d11 * d9)) / d10) * d4;
                float f3 = f2 + ((float) d12);
                this.mV = f3;
                float f4 = f + ((float) ((d7 + (d12 / 2.0d)) * d4));
                this.mPos = f4;
                int i4 = this.mBoundaryMode;
                if (i4 > 0) {
                    if (f4 < 0.0f && (i4 & 1) == 1) {
                        this.mPos = -f4;
                        this.mV = -f3;
                    }
                    float f5 = this.mPos;
                    if (f5 > 1.0f && (i4 & 2) == 2) {
                        this.mPos = 2.0f - f5;
                        this.mV = -this.mV;
                    }
                }
                i = i3 + 1;
                iSqrt = i2;
                d3 = d9;
            }
        }
    }
}
