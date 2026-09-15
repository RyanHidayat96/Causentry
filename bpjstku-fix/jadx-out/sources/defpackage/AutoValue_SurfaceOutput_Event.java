package defpackage;

import defpackage.AutoValue_SurfaceOutput_Event;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AutoValue_SurfaceOutput_Event<CHILD extends AutoValue_SurfaceOutput_Event<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    public setMaxResolution<? super TranscodeType> TuitionPaymentFragmentbindingInflater1 = setOutputImageFormat.b();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof AutoValue_SurfaceOutput_Event) {
            return getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, ((AutoValue_SurfaceOutput_Event) obj).TuitionPaymentFragmentbindingInflater1);
        }
        return false;
    }

    public int hashCode() {
        setMaxResolution<? super TranscodeType> setmaxresolution = this.TuitionPaymentFragmentbindingInflater1;
        if (setmaxresolution != null) {
            return setmaxresolution.hashCode();
        }
        return 0;
    }
}
