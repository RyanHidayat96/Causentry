package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import defpackage.submitCameraRequest;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ComplianceData {

    public static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        public abstract ComplianceData TuitionPaymentFragmentbindingInflater1();

        public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(submitCameraRequest submitcamerarequest);

        public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault1 b(ProductIdOrigin productIdOrigin);
    }

    public abstract ProductIdOrigin TuitionPaymentFragmentbindingInflater1();

    public abstract submitCameraRequest b();

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin, still in use, count: 1, list:
  (r0v0 com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin) from 0x001e: INVOKE 
  (r3v2 android.util.SparseArray)
  (0 int)
  (r0v0 com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin)
 VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:33)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class ProductIdOrigin {
        /* JADX INFO: Fake field, exist only in values array */
        NOT_SET(0),
        EVENT_OVERRIDE(5);

        private final int value;

        public static ProductIdOrigin valueOf(String str) {
            return (ProductIdOrigin) Enum.valueOf(ProductIdOrigin.class, str);
        }

        public static ProductIdOrigin[] values() {
            return (ProductIdOrigin[]) TuitionPaymentFragmentspecialinlinedviewModeldefault3.clone();
        }

        static {
            ProductIdOrigin productIdOrigin = EVENT_OVERRIDE;
            SparseArray sparseArray = new SparseArray();
            sparseArray.put(0, productIdOrigin);
            sparseArray.put(5, productIdOrigin);
        }

        private ProductIdOrigin(int i) {
            super(str, i);
            this.value = i;
        }
    }
}
