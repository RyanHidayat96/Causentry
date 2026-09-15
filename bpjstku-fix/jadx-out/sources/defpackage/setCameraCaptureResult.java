package defpackage;

import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
public final class setCameraCaptureResult {
    public MapMakerInternalMap.Strength TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public Equivalence<Object> b;
    private MapMakerInternalMap.Strength g;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1;
    public int TuitionPaymentFragmentbindingInflater1 = -1;

    public final setCameraCaptureResult b(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.g;
        if (strength2 == null) {
            this.g = strength;
            if (strength != MapMakerInternalMap.Strength.STRONG) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            }
            return this;
        }
        throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("Key strength was already set to %s", strength2));
    }

    public final MapMakerInternalMap.Strength TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        MapMakerInternalMap.Strength strength = this.g;
        MapMakerInternalMap.Strength strength2 = MapMakerInternalMap.Strength.STRONG;
        if (strength == null) {
            if (strength2 == null) {
                throw new NullPointerException("Both parameters are null");
            }
            strength = strength2;
        }
        return strength;
    }

    public final MapMakerInternalMap.Strength TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        MapMakerInternalMap.Strength strength = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        MapMakerInternalMap.Strength strength2 = MapMakerInternalMap.Strength.STRONG;
        if (strength == null) {
            if (strength2 == null) {
                throw new NullPointerException("Both parameters are null");
            }
            strength = strength2;
        }
        return strength;
    }

    public final <K, V> ConcurrentMap<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return MapMakerInternalMap.b(this);
        }
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i == -1) {
            i = 16;
        }
        int i2 = this.TuitionPaymentFragmentbindingInflater1;
        if (i2 == -1) {
            i2 = 4;
        }
        return new ConcurrentHashMap(i, 0.75f, i2);
    }

    public final String toString() {
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i != -1) {
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1("initialCapacity", String.valueOf(i));
        }
        int i2 = this.TuitionPaymentFragmentbindingInflater1;
        if (i2 != -1) {
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1("concurrencyLevel", String.valueOf(i2));
        }
        MapMakerInternalMap.Strength strength = this.g;
        if (strength != null) {
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1("keyStrength", isOpen.b(strength.toString()));
        }
        MapMakerInternalMap.Strength strength2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (strength2 != null) {
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1("valueStrength", isOpen.b(strength2.toString()));
        }
        if (this.b != null) {
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2("keyEquivalence");
        }
        return tuitionPaymentFragmentbindingInflater1.toString();
    }
}
