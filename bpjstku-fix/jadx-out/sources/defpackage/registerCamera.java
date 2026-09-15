package defpackage;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class registerCamera {

    public static final class TuitionPaymentFragmentbindingInflater1 {
        private static long asInterface;
        private static char[] d;
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1;
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public boolean b;
        private static final byte[] $$c = {89, 92, -72, 43};
        private static final int $$d = ModuleDescriptor.MODULE_VERSION;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {115, 98, 19, 9};
        private static final int $$b = 43;
        private static int asBinder = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f1341a = 1;

        public static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
            public TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            public String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            public Object b;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(int r7, int r8, byte r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 3
                int r9 = r9 + 1
                byte[] r0 = registerCamera.TuitionPaymentFragmentbindingInflater1.$$a
                int r8 = r8 + 4
                int r7 = 103 - r7
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r8
                r8 = r9
                r5 = r2
                goto L2b
            L13:
                r3 = r2
            L14:
                int r8 = r8 + 1
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r9) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L25:
                r3 = r0[r8]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L2b:
                int r7 = -r7
                int r7 = r7 + r8
                r8 = r3
                r3 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: registerCamera.TuitionPaymentFragmentbindingInflater1.e(int, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:43:0x01cc  */
        /* JADX WARN: Code duplicated, block: B:44:0x01cd  */
        private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
            long j;
            Throwable cause;
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (true) {
                j = 0;
                if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                    break;
                }
                int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(d[i + i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.green(0), 2187 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 40, 841711447, false, $$e(b, b2, (byte) (b2 + 3)), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(asInterface), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getSize(0) + 33017), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3011, (ViewConfiguration.getJumpTapTimeout() >> 16) + 26, 321985076, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = (byte) (b5 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.green(0) + 36505), TextUtils.indexOf("", "") + 3376, (ViewConfiguration.getEdgeSlop() >> 16) + 17, -968507904, false, $$e(b5, b6, (byte) (-b6)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } catch (Throwable th) {
                            cause = th.getCause();
                            if (cause != null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            char[] cArr = new char[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i5 = $11 + 35;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36504 - TextUtils.lastIndexOf("", '0', 0)), 3377 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -968507904, false, $$e(b7, b8, (byte) (-b8)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                int i7 = $10 + 11;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                j = 0;
            }
            objArr[0] = new String(cArr);
        }

        public /* synthetic */ TuitionPaymentFragmentbindingInflater1(String str, byte b) {
            this(str);
        }

        private TuitionPaymentFragmentbindingInflater1(String str) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.b = false;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        }

        public final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
            int i = 2 % 2;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = obj;
            int i2 = asBinder + 111;
            f1341a = i2 % 128;
            if (i2 % 2 != 0) {
                return this;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final String toString() throws Throwable {
            int i = 2 % 2;
            boolean z = this.b;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            sb.append('{');
            String str = "";
            for (TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1; tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null; tuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                Object obj = tuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
                if ((tuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3) || obj != null || !z) {
                    sb.append(str);
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                        int i2 = f1341a + 67;
                        asBinder = i2 % 128;
                        int i3 = i2 % 2;
                        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        int i4 = f1341a + 91;
                        asBinder = i4 % 128;
                        int i5 = i4 % 2;
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                        int i6 = f1341a + 93;
                        asBinder = i6 % 128;
                        int i7 = i6 % 2;
                    }
                    Object[] objArr = new Object[1];
                    c(View.MeasureSpec.getSize(0), View.MeasureSpec.getMode(0) + 2, (char) Color.green(0), objArr);
                    str = (String) objArr[0];
                }
            }
            sb.append('}');
            return sb.toString();
        }

        public final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(String str, Object obj) {
            int i = 2 % 2;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = obj;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            int i2 = asBinder + 121;
            f1341a = i2 % 128;
            int i3 = i2 % 2;
            return this;
        }

        public final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, Object obj) {
            int i = 2 % 2;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3((byte) 0);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = obj;
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            int i2 = f1341a + 107;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return this;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
            private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            }

            public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte b) {
                this();
            }
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context r67, int r68, int r69, int r70) {
            /*
                Method dump skipped, instruction units count: 14229
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context, int, int, int):java.lang.Object[]");
        }

        static {
            char[] cArr = new char[2154];
            ByteBuffer.wrap("±°mð±³m´\ta%\u000eÀ\u0083ü\u0087\u0098;·äS\u0098\u000fV+\rÆ«âd\u009e\u001f½ÕY\u008cu8\u0010âÌ¡èK\u0084\u001f£ÿ_g{8\u0016Ý2\u0093îA±³m´\ta%\u000eÀ\u0083ü\u0087\u0098;·äS\u0098\u000fV+\rÆ«âd\u009e\u001f½ÄY\u0081u,\u0010õÌ\u009bè\\\u0084\u001c£Ò_w{<\u0016Ø±³m´\ta%\u000eÀ\u0083ü\u0087\u0098;·äS\u0098\u000fV+\rÆ«âd\u009e\u001f½ÇY\u0091u2\u0010ó±³m£\t}%\u000bÀ\u0083ü\u008d\u0098;·ìS\u0089\u000f\\+\u0001Æ÷âk\u009e/½ØY\u008cu:\u0010ùÌ·èP\u00843£Â_u{<\u0016È2\u0095îV\u008dá±³mµ\tp%\u001bÀ\u0083ü\u0084\u00983·¦S\u008c\u000fB+\u000bÆ¨±³mµ\tp%\u001bÀ\u0083ü\u0093\u0098=·åSÒ\u000f@+\u0016Æ·â|>öâæ\u0086%ª^O\u0088s×\u0017u8âÜë\u00803¤lIòm?\u0011`2µÖÌúm\u009f´æ9:>^ïr\u0086\u0097G«EÏðàa\u0004\u0006XÏ|\u0087\u0091<µàÉ¥±îm¿\t*%\u001aÀÃü\u008f\u0098 ·¦S\u008e\u000fU+\u0000Æªâc\u009e)½ÐY·u2\u0010õÌ°èg\u0084\b£Î_g{y±îm¿\t*%\u001aÀÃü\u008f\u0098 ·¦S\u008e\u000fU+\u0000Æªâc\u009e)½ÐY·u2\u0010õÌ°èg\u0084\b£Î_g{z±³m£\t}%\u000bÀØü\u0085\u00989·§S\u0090\u000fY+\u0006Æ÷â`\u009e)½ÖY\u0086u>\u0010¾Ì·èW[M\u0087\nãÐÏ¥*p\u0016+±³m£\t}%\u000bÀØü\u0085\u00989·§S\u009e\u000fY+\nÆ÷âb\u009e%½ÙY\u009du\n\u0010ÝÌéèV\u0084\t£Í_a{e\u0016ß2\u009fîJ\u008dì©¾Eoa\u0018±³m£\t}%\u000bÀØü\u0085\u00989·§S\u009e\u000fY+\nÆ÷âb\u009e%½ÙY\u009du\n\u0010ÝÌéèH\u0084\u001e£Ï_d\u00002Ü\"¸ü\u0094\u008aqYM\u0004)¸\u0006&â\u0011¾Ø\u009a\u0087wvSá/¨\fWè\u0007Ä¸¡|}0Yï5 \u0012QîçÊ¦§M\u0083__Ö<v±³m´\ta%\u000eÀ\u0083ü\u008e\u00981·åS\u0089\u000fW+\u0011Æ½â\u007f\u009e4±îm¿\t*%\u001aÀÙü\u0089\u00988·ìSÒ\u000fX+\u000bÆ«âx±òmµ\te%\u000bÀÉüÎ\u0098:·íS\u0088ç\u0080;\u0093_Es$\u0096üªüÎ\u0001áÒ\u0005£Yf}$\u0090\u0092´LÈ\u0007ëâ\u000f¶#\u001c!æý¡\u0099}µ\u0019PËl\u0092±îm¿\t*%\bÀÞü\u008f\u00980·ýS\u009f\u000fD+JÆµâm\u009e.½ÁY\u008eu=\u0010óÌ°èM\u0084\u001e£Å_f±ûmµ\tj%\u0001\u001e\u0086Âß¦\u001c\u008aao¯Sù7J\u0018Ìüå #\u0084}i\u009cM\u00041N\u0012ðöæÚS¿\u0098cÛG5+(\f\u00adð\u000eÔW¹ø\u009düA/\"\u0099\u0006Ãê5Îy³²\u0097\u0003{e\\\u009c\u0000÷ä(Èn\u00adÛ\u0091\u0010usV¨'ßû\u0086\u009fE³8Vöj \u000e\u0013!\u0095Å¼\u0099z½$PÅt]\b\u0017+©Ï¿ã\n\u0086ÁZ\u0082~l\u0012q5ôÉWí\u000e\u0080¡¤¥xv\u001bÀ?\u009aÓl÷ \u008aë®ZB<eÁ9®Ýqñ7\u0094\u0088¨I·_k\u0006\u000fÅ#¸Ævú \u009e\u0093±\u0015U<\tú-¤ÀEäÝ\u0098\u0097»)_?s\u008a\u0016AÊ\u0002îì\u0082ñ¥aYÈ}Õ\u0010l42èþ°?lf\b¥$ØÁ\u0016ý@\u0099ó¶uR\\\u000e\u009a*ÄÇ%ã½\u009f÷¼IX_tê\u0011!Íbé\u008c\u0085\u0091¢\u0001^¨zµ\u0017\u00033Bï\u0094Ø¨\u0004ñ`2LO©\u0081\u0095×ñdÞâ:Ëf\rBS¯²\u008b*÷`ÔÞ0È\u001c}y¶¥õ\u0081\u001bí\u0006Ê\u00966?\u0012\"\u007f\u0095[×\u0087\u0003±ìmµ\tv%\u000bÀÅü\u0093\u0098 ·¦S\u008f\u000fI+\u0017Æöân\u009e$½\u009aY\u008cu9\u0010òÌ±è_\u0084B£Ò_{{f\u0016Ñ2\u009eîGÜÉ\u0000\u0091dHH#\u00adü\u0091¥\u0094kHx,®\u0000Ïå\u0017Ù\u0017½á\u0092?v@*\u009d\u000eÐãeÇ§§A{\u0019\u001fÀ3«Ö`ê>\u008e\u009a¡PE#(¢ô²\u0090l¼\u001aYÉe\u0094\u0001(.¶Ê\u008b\u0096S²\u0014_¤{x\u0007&$ÊÀ\u008bì&\u0089®U¢q@\u001d\u0013:ÕÆjâ.\u008fÞ«ÌwF\u0014ð0®Üeø\u0000\u0085Ô¡RM2jð6\u009bÒKþ\u0014\u009b·§7C\u0007`À\f\u0087±³m¦\ta%\u0016ÀÈü\u008f\u0098&·§S\u0090\u000fY+\u0006Æîâ8\u009eo½ÜY\u009fus\u0010ñÌ±è\\\u0084\u0005£Ï_:{8\u0016Î2\u0099îI\u008dù©¾EyaZ\u001cß8uÔ>óà¯\u0097K[g\u0013\u0002ú>{Ú\u0013\u0084øXí<*\u0010]õ\u0083ÉÄ\u00adm\u0082ìfÛ:\u0012\u001eMó¥×s«$\u0088\u0097lÔ@8%³ùøÝ\u0010±H\u0096\u0086j/Nl#\u0084\u0007ÞÛ\u001d¸ý\u009cðp\"TQ)\u0087\r8álÆ¼\u009a\u009d~\u0014RD&Mú]\u009e\u0083²õW&k{\u000fÇ YÄn\u0098§¼øQ\u0010uÆ\t\u0091*)ÎzâÍ\u0087\u001b[^\u007f\u0099\u0013ó47È\u008eìÚ\u0081\u001d¥gy´\u001a\u0012>WÒ\u008cöì\u008b7¯\u0081CËdW8eÜ¢ðî\u0095\u0004©\u0085Mí\u0016¹Ê¿®z\u0082\u0011g\u0089[\u0083?0\u0010ëô\u0082¨\u0015\u008c\u0007a¼Eo9>\u001a\u0090þ\u0081Ò:·õk»OV#\u0015\u0004ÏølÜ4±ß\u0095\u0099IK*¼\u000e´âi\u0002\u001dÞsº¬\u0096Çs\u0007OI+æ\u0004'àU¼\u0098±ém¾\to%\u0016ÀÃü\u0097\u0098:¶\u0012jU\u000e\u009b\"úÇ,ûd\u009fÌ°\bÂm\u001e<z©V\u008b³]\u008f\fë³Ä~ \u001c|ÇXÉµ?\u0091êíµÎ^*\b\u0006º±êm²\tk%\u0000À\u0094üÖ\u0098$±ûmµ\tj%\u001dÀÞü\u0089\u00987±ûmµ\tj%\u001dÀÞü\u0089\u00987·×S\u0084\u000f\b+Rh\f´BÐ\u009düê\u0019)%~AÀn \u008asÖÿò¥\u001fp;ÍG\u0083±îm¿\t*%\bÀÞü\u008f\u00980·ýS\u009f\u000fD+JÆµâc\u009e$½ÑY\u0084±ïm´\to\u0084\u0002XF<\u008a\u0010ïõ6Éo\u00adÀ\u0082\u0001±Ým \tt%XÀþü\u0095\u0098:·üS\u0095\u000f]+\u0001Æøâj\u009e/½ÆYÈu\u001f\u0010øÌ¶èW\u0084\u0001£ÅX=\u0084^à\u0080Ìê)#\u0015iqÐ^HºOæ\u0094ÂÏ/\u0018\u000b\u008ewÕT=°d\u009cÈùP%B\u0001·mþJ`¶\u008c\u0092\u0090ÿj±Ým¾\t`%\nÀÃü\u0089\u00980·¨S¯\u000ft+/Æøân\u009e5½ÝY\u0084u(\u0010°Ì¢èW\u0084\u001e£\u0080_l{p\u0016\u008a2¯î\u0012\u008d¬±îm¿\t*%\u0010ÀÍü\u0092\u00980·ÿS\u009d\u000fB+\u0001±ûm¿\th%\u001cÀÊü\u0089\u0098'·àª:vb\u0012»>ÐÛDç\u0006±îm±\tj%\u001bÀÄü\u0095Ø^\u0004\u000f`\u009aL¸©n\u0095?ñ\u0080ÞM:/fôBú¯\n\u008bÎ÷\u0091Ôj0<ì\u00010PTÅxü\u009d&¡}ÅÕê\u0002\u000e\u007fRñvú\u009bR¿\u008eÃÚ¾Ç±îm¿\t*%\u000bÀÉü\u0083\u0098!·úS\u0099\u0080^±îm¿\t*%\u001aÀÙü\u0089\u00988·ìSÒ\u000f@+\u0016Æ·âh\u009e5½×Y\u009cR|\u008e#êîÆ\u0092#u\u001f\u001e{êT8±îm¿\t*%\u001aÀÙü\u0089\u00988·ìSÒ\u000fV+\rÆ¶âk\u009e%½ÆY\u0098u.\u0010ùÌªèLk¶·øÓ'ÿP\u001a\u0093&ÄBzmê\u0089ÂÕ\u0019ñB\u001cº8&Dhg\u0097\u0083À¯cÊ´\u0016ê\u0010ÈÌ\u0086¨Y\u0084.aí]º9\u0004\u0016äò·®;\u008aagÄCL?\u0017\u001cìø\u0084Ô\u0017±\u009bmÁI$%8\u0002öþIÚ\u001e·ý\u0093ªOt,ô\b\u0087ä\u000bÀqUu\u0089;íäÁ\u0093$P\u0018\u0007|¹S)·\u0015ëÑÏ\u0085\"1\u0006îz«Ye½\u0015\u0091¶ôu(e\fÑ`\u0087G@»ÿ\u009f´ò[Ö\u001d\u0018\u0012Ä\\ \u0083\u008côi7U`1Þ\u001eNúc¦»\u0082âoIKÝ7\u009f\u0014-ð.ÜÃ¹\u001beBA©-½\n\u007fö\u008d±ûm¿\tk%\u001fÀÀü\u0085\u0098{·ûS\u0098\u000f[+;Æ¿â|\u009e(½ÛY\u0086u9\u0010ÏÌ¼è\u0000\u0084Z£\u008f_s{-\u0016Ò2\u0095îV\u008dñ©¯E_a\f\u001c\u00908*Â£\u001eòzgVW³\u008e\u008fÂëmÄ© Þ|\u001cXMµð\u00913±îm¿\t*%\u001aÀÃü\u008f\u0098 ·áS\u0091\u000fQ+\u0003Æ½â\"\u009e\"½ÁY\u0081u0\u0010ôÌêè^\u0084\u0005£Î_s{-\u0016Î2\u0080îV\u008dñ©¢Et`£¼ÀØ\u001eôt\u0011½-÷INfÛ\u0082úÞvú,±îm¿\t*%\u001aÀÙü\u0089\u00988·ìSÒ\u000fT+\rÆ«â|\u009e,½ÕY\u0091ur\u0010ùÌ ±èmµ\tw%\fÀ\u0081±õm¾\tm%\fÀ\u0082ü\u0093\u0098\"·ëSÒ\u000fA+\u0001Æµây\u009em½ÄY\u009au3\u0010àÌ·±ímµ\ti%\rÀ\u0082ü\u0088\u0098#·¦S\u0091\u000fQ+\rÆ¶âg\u009e%½ÍY\u009b±ímµ\ti%\rÀ\u0082ü\u0093\u00982·¦S\u009a\u000fQ+\u000fÆ½âS\u009e#½ÕY\u0085u9\u0010âÌ¥\u000b\u001d×E³\u0099\u009fýzrFc\"Â\rVé`µ£\u0091ð|wX\u0098$Õ\u0007*ãkÏÅª\u0014vMÙÄ\u0005\u0095a\u0000M9¨ã\u0094¸ð\u0010ßÇ;ºg4C/®\u009c\u008aBö\u0018Õñ1«\u001d\u0012x\u0094¤\u009f\u0080wì+Ëÿ7Z\u0083´_å;p\u0017@ò\u0099ÎÕªz\u0085üa×=\u000f\u0019Sô÷Ðx¬{\u008f\u0098kÖGY\"¤þÿÚ\u000f¶S±îm¿\t*%\u0017ÀÈü\u008d\u0098z·êS\u0089\u000fY+\bÆ¼â\"\u009e&½ÝY\u0086u;\u0010õÌ¶èH\u0084\u001e£É_z{<±îm¿\t*%\bÀÞü\u008f\u00980·ýS\u009f\u000fD+JÆºây\u009e)½ØY\u008cur\u0010öÌ\u00adèV\u0084\u000b£Å_f{8\u0016Î2\u0099îJ\u008dì±îm¿\t*%\u000bÀÕü\u0093\u0098 ·íS\u0091\u000f\u001e+\u0006Æ\u00adâe\u009e,½ÐYÆu:\u0010ùÌªè_\u0084\t£Ò_d{:\u0016Õ2\u009eîP±îm¿\t*%\u000bÀÕü\u0093\u0098 ·íS\u0091\u000fo+\u0001Æ âx\u009en½ÖY\u009du5\u0010üÌ è\u0016\u0084\n£É_z{/\u0016Ù2\u0082îT\u008dê©¥Ena\u0000±îm¿\t*%\u000eÀÉü\u008e\u00980·çS\u008e\u000f\u001e+\u0006Æ\u00adâe\u009e,½ÐYÆu:\u0010ùÌªè_\u0084\t£Ò_d{:\u0016Õ2\u009eîP'\u008cûÝ\u009fH³lV«jì\u000eR!\u0085Åì\u0099\r½bPÖt\u0005\bO+øÏèãK\u0086\u009bZÊ~>\u0012 5¤É\u001fíD\u0080¹¤÷x4\u001b\u008a?ÜÓ\u000b÷x\u008a¾±´øÖ±µ±³m´\ta%\u000eÀ\u0083ü\u0091\u00981·åS\u0089\u000fo+\u0014Æ±â|\u009e%tD¨CÌ\u0096àù\u0005t9d]Ìr\u001c\u0096`Ê¢îç\u0003\u0000'\u0099[Öx0\u009cz°ÉÕ\u0006\t]-«AÄf0\u009a\u0086¾ÑÓ2÷c±³m´\ta%\u000eÀ\u0083ü\u0093\u0098;·ëS\u0097\u000fU+\u0010Æ÷âk\u009e%½ÚY\u0091u8\u001d\u0081Á\u0086¥S\u0089<l±P¡4\t\u001bÙÿ¥£g\u0087\"jÅNO2\u0017\u0011ëõ¯Ù\næ\u0018:\b^Ör \u0097(«:Ï\u009aàN\u0004\"XÄ|»\u0091\u0001µÆÉ\u0088êz±³m£\t}%\u000bÀØü\u0085\u00989·§S\u0090\u000fY+\u0006Æ÷â`\u009e)½ÖY\u008bu\u0003\u0010ýÌ¥èT\u0084\u0000£Ï_w{\u0017\u0016Ø2\u0095îF\u008dí©«E_a\u0005\u001cÍ8qÔ%óª¯\u008bKC±³m´\ta%\u000eÀ\u0083ü\u0082\u0098'·üS£\u000fW+\u0014Æ«±³m´\ta%\u000eÀ\u0083ü\u0082\u0098'·üS£\u000fD+\rÆµâi±³m´\ta%\u000eÀ\u0083ü\u0093\u0098;·ëS\u0097\u000fU+\u0010Æ÷ân\u009e3½ÀY\u008eu3\u0010üÌ è]\u0084\u001e£Ä^\u0011\u0082\u0001æßÊ©/z\u0013'w\u009bX\u0005¼2àûÄ¤)U\rÂq\u008bRt¶(\u009a\u008dÿF#\u0000\u0007õk¢Lf°Ó\u0094\u0098ùAÝ8\u0001èbSF@ªÑ\u008e¹±³m´\ta%\u000eÀ\u0083ü\u0082\u0098'·üS\u009d\u000fS+\u0007Æ½±³m´\ta%\u000eÀ\u0083ü\u0082\u0098'·üS\u009b\u000fI+\u0016Æ·h^´YÐ\u008cüã\u0019n%oAÊn\u0011\u008a|Ö¸òî\u001f[£S\u007fT\u001b\u00817îÒcîb\u008aÇ¥\u001cAs\u001d¢9íÔ]\u0092qNv*£\u0006ÌãAß@»å\u0094>pH,\u009f\bÕå}±³m´\ta%\u000eÀ\u0083ü\u0082\u0098'·üS\u008c\u000fW+\u0005Æ±â|\u009e#±³m´\ta%\u000eÀ\u0083ü\u0082\u0098'·üS£\u000fY+\tÆ½±³m´\te%\fÀÍüÏ\u00980·çS\u008b\u000f^+\bÆ·âm\u009e$½ÇYÇur\u0010èÌ¦è\u0017\u0084\u000e£Ó_`{#dR¸\\Ü\u008bðí\u0015b)vMÜb\u0007\u0086yÚ¾þò\u0013J7ÂKãh&\u008c} îÅ\u0019\u0019D=«Qèv%\u008a³®ÆÃ1çu; X\u000b±³m \tv%\u0017ÀÏüÏ\u0098=·çS\u008c\u000f_+\u0016Æ¬â\u007f±¬m¶\tb%XÀ\u0096±³m \tv%\u0017ÀÏüÏ\u0098'·íS\u0090\u000fV+KÆµâm\u009e0½Ç±ûm¢\te%\u0014ÀÀü\u008f\u00987·¦S\u009b\u000f_+\bÆ¼âj\u009e)½ÇY\u0080ur\u0010ãÌ«±ðm¹\tf%?Ààü¥\u0098\u0007·×S\u009e\u000fC+\u0010Æöâ\u007f\u009e/\u0084gXa<¤\u0010ÏõWÉY\u00adå\u00828fA:\u0085\u001eïóo×·«ð\u0088\u0005l_@û%jùhÝ\u0081±Ô~ê¢¨Æeê\t\u000fË3\u0080W!xÿ\u009c\u0083ÀWbp¾vÚ³öØ\u0013@/NKød>\u0080QÜ\u0087øÔ±³m´\te%\fÀÍüÏ\u00980·çS\u008b\u000f^+\bÆ·âm\u009e$½ÇYÇur\u0010ôÌ´è\u0017\u0084\r£Ð_d{;\u0016\u00922\u0088îI\u008dô±³m \tv%\u0017ÀÏüÏ\u00987·øS\u0089\u000fY+\nÆ¾âc±Ûm¿\th%\u001cÀÊü\u0089\u0098'·àId\u0095cñ²ÝÛ8\u001a\u0004\u0018`îO6«X÷\u0084Ó\u009c>\u007f\u001a©føE\u0005¡V\u008dçè\"4`\u0010À|Ø[\u0002§±\u0083°î[Ê\b\u0016\u0090u Qv½ù\u0099Îä\u0016À¨,õ\u000b<WY³\u0092\u009fÅúwÆñ\"Æ\u0001\u0002m^Iú\u00942ðzÜ\u0086".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
            d = cArr;
            asInterface = 3393580777348230608L;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(byte r6, int r7, byte r8) {
            /*
                int r7 = r7 + 4
                int r6 = r6 * 2
                int r0 = r6 + 1
                int r8 = r8 * 3
                int r8 = 115 - r8
                byte[] r1 = registerCamera.TuitionPaymentFragmentbindingInflater1.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L14
                r3 = r6
                r4 = r2
                goto L2a
            L14:
                r3 = r2
            L15:
                int r7 = r7 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L22:
                r4 = r1[r7]
                int r3 = r3 + 1
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2a:
                int r8 = -r8
                int r8 = r8 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: registerCamera.TuitionPaymentFragmentbindingInflater1.$$e(byte, int, byte):java.lang.String");
        }
    }
}
