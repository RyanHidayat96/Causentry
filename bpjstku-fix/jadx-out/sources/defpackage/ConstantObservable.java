package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ConstantObservable {
    static {
        new retrieveOption() { // from class: ConstantObservable.2
            @Override // defpackage.retrieveOption
            protected final char[] b(char c) {
                return null;
            }

            @Override // defpackage.retrieveOption, defpackage.getPriorities
            public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
                return str;
            }
        };
    }

    public static TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3((byte) 0);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        String TuitionPaymentFragmentbindingInflater1;
        public char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final Map<Character, String> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte b) {
            this();
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new HashMap();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 0;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = CharCompanionObject.MAX_VALUE;
            this.TuitionPaymentFragmentbindingInflater1 = null;
        }

        /* JADX INFO: renamed from: ConstantObservable$TuitionPaymentFragmentspecialinlinedviewModeldefault3$1, reason: invalid class name */
        public class AnonymousClass1 extends retrieveOptionWithPriority {
            public static int TuitionPaymentFragmentbindingInflater1;
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            private final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;

            public AnonymousClass1(Map map, char c, char c2) {
                super((Map<Character, String>) map, c, c2);
                String str = TuitionPaymentFragmentspecialinlinedviewModeldefault3.this.TuitionPaymentFragmentbindingInflater1;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            }

            @Override // defpackage.retrieveOptionWithPriority
            protected final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }

            public static int TuitionPaymentFragmentbindingInflater1() {
                int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i2 = i % 8472737;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
                if (i2 != 0) {
                    return TuitionPaymentFragmentbindingInflater1;
                }
                int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
                TuitionPaymentFragmentbindingInflater1 = i3;
                return i3;
            }
        }
    }
}
