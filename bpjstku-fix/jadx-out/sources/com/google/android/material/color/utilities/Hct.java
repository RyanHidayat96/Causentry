package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes4.dex */
public final class Hct {
    private int argb;
    private double chroma;
    private double hue;
    private double tone;

    public static Hct from(double d, double d2, double d3) {
        return new Hct(HctSolver.solveToInt(d, d2, d3));
    }

    public static Hct fromInt(int i) {
        return new Hct(i);
    }

    private Hct(int i) {
        setInternalState(i);
    }

    public final double getHue() {
        return this.hue;
    }

    public final double getChroma() {
        return this.chroma;
    }

    public final double getTone() {
        return this.tone;
    }

    public final int toInt() {
        return this.argb;
    }

    public final void setHue(double d) {
        setInternalState(HctSolver.solveToInt(d, this.chroma, this.tone));
    }

    public final void setChroma(double d) {
        setInternalState(HctSolver.solveToInt(this.hue, d, this.tone));
    }

    public final void setTone(double d) {
        setInternalState(HctSolver.solveToInt(this.hue, this.chroma, d));
    }

    public final Hct inViewingConditions(ViewingConditions viewingConditions) {
        double[] dArrXyzInViewingConditions = Cam16.fromInt(toInt()).xyzInViewingConditions(viewingConditions, null);
        Cam16 cam16FromXyzInViewingConditions = Cam16.fromXyzInViewingConditions(dArrXyzInViewingConditions[0], dArrXyzInViewingConditions[1], dArrXyzInViewingConditions[2], ViewingConditions.DEFAULT);
        return from(cam16FromXyzInViewingConditions.getHue(), cam16FromXyzInViewingConditions.getChroma(), ColorUtils.lstarFromY(dArrXyzInViewingConditions[1]));
    }

    private void setInternalState(int i) {
        this.argb = i;
        Cam16 cam16FromInt = Cam16.fromInt(i);
        this.hue = cam16FromInt.getHue();
        this.chroma = cam16FromInt.getChroma();
        this.tone = ColorUtils.lstarFromArgb(i);
    }
}
