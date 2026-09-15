package com.google.common.base;

import com.google.common.base.Suppliers;
import defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda0;
import defpackage.tryOpenCamera;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class Suppliers {
    public static <T> CameraStateRegistryCameraRegistrationExternalSyntheticLambda0<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraStateRegistryCameraRegistrationExternalSyntheticLambda0<T> cameraStateRegistryCameraRegistrationExternalSyntheticLambda0) {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(cameraStateRegistryCameraRegistrationExternalSyntheticLambda0);
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> implements CameraStateRegistryCameraRegistrationExternalSyntheticLambda0<T> {
        private static final CameraStateRegistryCameraRegistrationExternalSyntheticLambda0<Void> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new CameraStateRegistryCameraRegistrationExternalSyntheticLambda0() { // from class: tryOpenCaptureSession
            @Override // defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda0
            public final Object get() {
                return Suppliers.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
            }
        };
        private volatile CameraStateRegistryCameraRegistrationExternalSyntheticLambda0<T> TuitionPaymentFragmentbindingInflater1;
        private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Object();
        private T b;

        public static /* synthetic */ Void TuitionPaymentFragmentbindingInflater1() {
            throw new IllegalStateException();
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraStateRegistryCameraRegistrationExternalSyntheticLambda0<T> cameraStateRegistryCameraRegistrationExternalSyntheticLambda0) {
            this.TuitionPaymentFragmentbindingInflater1 = cameraStateRegistryCameraRegistrationExternalSyntheticLambda0;
        }

        @Override // defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda0
        public final T get() {
            CameraStateRegistryCameraRegistrationExternalSyntheticLambda0<T> cameraStateRegistryCameraRegistrationExternalSyntheticLambda0 = this.TuitionPaymentFragmentbindingInflater1;
            CameraStateRegistryCameraRegistrationExternalSyntheticLambda0<T> cameraStateRegistryCameraRegistrationExternalSyntheticLambda1 = (CameraStateRegistryCameraRegistrationExternalSyntheticLambda0<T>) TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (cameraStateRegistryCameraRegistrationExternalSyntheticLambda0 != cameraStateRegistryCameraRegistrationExternalSyntheticLambda1) {
                synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    if (this.TuitionPaymentFragmentbindingInflater1 != cameraStateRegistryCameraRegistrationExternalSyntheticLambda1) {
                        T t = this.TuitionPaymentFragmentbindingInflater1.get();
                        this.b = t;
                        this.TuitionPaymentFragmentbindingInflater1 = cameraStateRegistryCameraRegistrationExternalSyntheticLambda1;
                        return t;
                    }
                }
            }
            return this.b;
        }

        public final String toString() {
            Object string = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (string == TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                StringBuilder sb2 = new StringBuilder("<supplier that returned ");
                sb2.append(this.b);
                sb2.append(">");
                string = sb2.toString();
            }
            sb.append(string);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> CameraStateRegistryCameraRegistrationExternalSyntheticLambda0<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t) {
        return new SupplierOfInstance(t);
    }

    static class SupplierOfInstance<T> implements CameraStateRegistryCameraRegistrationExternalSyntheticLambda0<T>, Serializable {
        private static final long serialVersionUID = 0;
        final T instance;

        SupplierOfInstance(T t) {
            this.instance = t;
        }

        @Override // defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda0
        public T get() {
            return this.instance;
        }

        public boolean equals(Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return tryOpenCamera.b(this.instance, ((SupplierOfInstance) obj).instance);
            }
            return false;
        }

        public int hashCode() {
            return tryOpenCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.instance);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Suppliers.ofInstance(");
            sb.append(this.instance);
            sb.append(")");
            return sb.toString();
        }
    }
}
