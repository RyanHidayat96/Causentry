package defpackage;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.google.common.collect.Cut;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Range;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraStateRegistryOnOpenAvailableListener {
    private static final Collector<Object, ?, ImmutableList<Object>> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Collector.of(new Supplier() { // from class: addAllTags
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static final byte[] $$c = {117, -15, -81, 1};
        private static final int $$d = 74;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {87, -91, 60, 112};
        private static final int $$b = 165;
        private static int b = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r7, byte r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = 103 - r7
                int r8 = r8 * 2
                int r8 = 4 - r8
                byte[] r0 = defpackage.addAllTags.$$a
                int r9 = r9 * 4
                int r9 = 1 - r9
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L29
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r9) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L24:
                r3 = r0[r8]
                r6 = r3
                r3 = r8
                r8 = r6
            L29:
                int r8 = -r8
                int r7 = r7 + r8
                int r8 = r3 + 1
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.addAllTags.c(byte, byte, int, java.lang.Object[]):void");
        }

        @Override // java.util.function.Supplier
        public final Object get() {
            int i = 2 % 2;
            int i2 = b + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                ImmutableList.g();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ImmutableList.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1G = ImmutableList.g();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
            b = i3 % 128;
            int i4 = i3 % 2;
            return tuitionPaymentFragmentbindingInflater1G;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i4 = $10 + 77;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i6 = $10 + 71;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c2 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int iResolveSize = 2187 - View.resolveSize(0, 0);
                        int packedPositionGroup = 40 - ExpandableListView.getPackedPositionGroup(0L);
                        byte b2 = (byte) ($$c[3] - 1);
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iResolveSize, packedPositionGroup, 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 33016);
                        int iMakeMeasureSpec = 3011 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iArgb = Color.argb(0, 0, 0, 0) + 26;
                        byte b4 = (byte) ($$c[3] - 1);
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, iMakeMeasureSpec, iArgb, 321985076, false, $$e(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) (36504 - TextUtils.lastIndexOf("", '0', 0));
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 3377;
                        int maxKeyCode = 17 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b6 = $$c[3];
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, modifierMetaStateMask, maxKeyCode, -968507904, false, $$e(b7, b7, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char modifierMetaStateMask2 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 36506);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 3376;
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 17;
                    byte b8 = $$c[3];
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask2, offsetBefore, offsetAfter, -968507904, false, $$e(b9, b9, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
            int i9 = $11 + 27;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
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
        public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(android.content.Context r67, int r68, int r69, int r70) {
            /*
                Method dump skipped, instruction units count: 13956
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.addAllTags.TuitionPaymentFragmentbindingInflater1(android.content.Context, int, int, int):java.lang.Object[]");
        }

        static {
            char[] cArr = new char[2154];
            ByteBuffer.wrap("t\u0001õ\fvÇ÷\u008aq\u0019ò\u0017såü¨~zÿ>xûú_{\u000eäÿe\u009bçP`*áúb§ìom%îÏhYé\u0014jßë\u009bUW¿Ð>Ý½\u0016<[ºÈ9Æ¸47yµ«4ï³*1\u008e°ß/.®[,\u008c«ï*<©L'©¦÷%3£\u0098\"Á¡\u000b±³0¾³u28´«7¥¶W9\u001a»È:\u008c½I?í¾¼!M ;\"ÿ¥\u0092$YÌ{MaÎ¡OõÉcJgË\u009fDÚÆ\u0011GNÀ\u008dByÃ{\\µÝì_*ØRY\u009bÚËT\u000eÕsV\u0088Ð1QjÒ°Sçí:nOd\u0084å\u0088fSç\u001aa\u009câ\u0091chìonëï¯hxêÙ\u001cí\u009dá\u001e:\u009fs\u0019õ\u009aï\u001b\u000f\u0094E\u0016Ü\u0097Ä\u0010\f\u0092¯\u0013ú±³0©³t2-´å7°¶\\9Y»þ:¬½m?ñ¾¢!w \f\"ç¥\u0088$[\u008eg\u000fj\u008c¥\rî\u008b1\b9\u0089Â\u0006Á\u0084\b\u0005K\u0082\u009d\u0000$\u0081f\u001e©«\u008e*Õ©^(L®\u008b-Í¬,#8¡¾ ï§$%\u008c¤Û;\u001bºL8¹¿ò>?½d3\u0091²à1,·\u008b6\u0087±î0µ³>2,´ë7\u00ad¶L9X»Þ:\u008f½D?ì¾»!{ ,\"Ù¥\u0092$_§\u0004)ñ¨\u0080+L\u00adë,ä±³0©³i2=´ð7§¶U9Y»À:\u0083½B?±¾¸!{ *\"è¥\u009e$\u0014§\u0003)Á±þ0³³w2 ´ë7º\u0085Ì\u0004Ö\u0087\u0016\u0006B\u0080\u008f\u0003Ø\u0082*\r&\u008f±\u000eü\u00891\u000bÎ\u008aÅ\u0015\b\u0094Z\u0016\u008c\u0091Õ\u0010\b\u0093\"\u001d¿\u009cþ\u001f0\u0099\u0092\u0018\u0084\u009b\u0010\u001aZ¤\u0091'õ¦9!b£»±³0©³i2=´ð7§¶U9Y»Î:\u0083½N?±¾º!w %\"ó¥ª$w§])Þ¨\u0096+M\u00adè¾Ç?Ý¼\u001d=I»\u00848Ó¹!6-´´5÷²60Å±Ì.\u000f¯^-\u009cªí+#¨q&\u008c§Ý$&¢\u009e#Í \b!\u0010\u009f\u0087\u001cå\u0095ë\u0014æ\u0097-\u0016`\u0090ó\u0013ô\u0092\u0005\u001dC\u009f\u0081\u001eÕ\u0099\r\u001b£\u009aÿ\u0005>±î0µ³>2,´ñ7«¶T9\u0012»\u0082:\u0082½O?í¾ ±ò0¿³q2=´á7ì¶V9\u0013»Ø={¼b?ª¾é8/»%:\u0096µ×7\b¶G1\u009b³/2o\u00ad®,å®#)G\u0010\f\u0091A\u0012\u0083\u0093Å\u0015\t\u0096Z±î0µ³>2>´ö7\u00ad¶\\9\u0003»Ï:\u009e½\u000e?ó¾µ!| =\"à¥\u009d$Y§\u0004)Û¨\u0096+G\u00adê±û0¿³~27±ì0¿³b2=´í7±¶L9X»ß:\u0093½S?°¾¶!v f\"â¥\u0099$X§\u0005)É¨Ê+E\u00adè,£¯\".,\u0090á\u0013\u0095\u0092Q\u0015-\u0097Ï\u0016\u0096\u0099)\u001bÅ\u009a¢\u001dk\u009c*\u001eæ\u0081\u009d\u0000D\u0083\t\u0005Øïvn%íøl§êwi+èÖgÂåEd\tãÉa*à,\u007fìþü|xû\u0003zÂù\u009fwSöPußórr9ñ¸p¶Î{M\u000fÌËK·ÉUH\fÇ³E_Ä<CñÂ°@|ß\r^Þ~@ÿ\u0013|Îý\u0091{Aø\u001dyàöôtsõ?rÿð\u001cq\u001aîÚoÊíNj5ëôh©æegfäüb[ãT`Ãá\u0097_E°#1p²\u00ad3òµ\"6~·\u00838\u0097º\u0010;\\¼\u009c>\u007f¿y ¹¡©#-¤V%\u0097¦Ê(\u0006©\u0005*\u009f¬8-7®¯/ä\u0091,±ì0¿³b2=´í7±¶L9X»ß:\u0093½S?°¾¶!v f\"â¥\u0099$X§\u0005)É¨Ê+P\u00ad÷,ø¯a.)\u0090ã±ì0¿³b2=´í7±¶L9X»ß:\u0093½S?°¾¶!v f\"â¥\u0099$X§\u0005)É¨Ê+P\u00ad÷,ø¯a.$\u0090ãäïe½æzg3áòb¡±³0ª³b2!´ç7í¶U9\u0019»È:\u009f½L?û¾§icè1köê¿ljï>nÔá\u008ccQ¶\u00187\u0002´Â5\u0096³[0\f±þ>ò¼a=3ºê8X¹\u001a&Î§\u008c%_¢<#¾ ¬.l¯!,íª\\+\n¨Ô)Ì\u0097X\u0014,\u0095ì\u0012\u00ad\u0090f\u0011 \u009e¨\u001cB\u009d\u001e\u001a×\u009b\u0099\u0019L\u0086!\u0007³\u0084\u00ad\u0002`\u00839±³0¬³u2 ´à7\u00ad¶J9Y»À:\u0083½B?¨¾à!=  \"ñ¥Ó$[§\u0005)Ê¨\u008d+M\u00ad¶,¦¯~.#\u0090í\u0013\u009f\u0092F\u0015\u000b\u0097\u0086\u0016\u0091\u00995\u001bô\u009a´\u001da\u009c3\u001eñ\u0081Ö\u0000E\u0083\u0003\u0003\u0088\u0082\u0097\u0001N\u0080\u001b\u0006Û\u0085\u0096\u0004q\u008bb\tû\u0088¸\u000fy\u008d\u0093\fÛ\u0093\u0006\u0012\u001b\u0090Ê\u0017è\u0096i\u0015<\u009bö\u001a°\u0099t\u001fÓ\u009e\u0082\u001dD\u009c\u0014\"É¡ë x§ %ý¤¹+\b©Ö(\u0098¯\u001b.\f¬Ö±³0©³i2=´ð7§¶U9Y»À:\u0083½B?¨¾à!= +\"ê¥\u0093$O§\u0014)ñ¨\u0085+K\u00adü,º¯S.#\u0090î\u0013\u008a\u0092Q\u0015\u0000\u0097Î\u0016\u0087\u0099?\u001bÿ\u009aý\u001dm\u009c4\u001eò\u0081Ö\u0000E\u0083\u00035\u0004´\b7Ó¶\u009a0\u001c³\u001c2á½¨?o¾r9þ»G:\n¥Ñ$Ñ¦R!' â#²\u00ad}, ¯ð)]¨\u0017+Òª\u009e\u0014R\u0097g\u0016ñ\u0091¦§Ò&¶¥w$>¢à!¤ E/\u0016\u00adÊ,\u008d±é0´³{2 ´ë7µ¶V<M½\u0000>Ð¿\u00939[º\u0019;ÿ´©\"q£* ¡¡¡'i¤2%Ãª\u009c(P©\u0001.\u0091¬e-.²û3¾±z6\u0006±ê0¸³\u007f26´¼7ô¶HÌwM3ÎòO§ÉzJ'Ë×±û0¿³~2+´ö7«¶[9)»Ô:Ò½\u0016ZxÛ<XýÙ¨_uÜ(]ØÒªPWÑQV\u0095ÔBUaÊ¥Í¦LýÏvNvÈ¾KåÊ\u0014EKÇ\u0087FÖÁFC»Âó]>Üe^¢%i¤8'ýã1b\u007fá\u00ad`êæ-e~ä\u009fkÌ\u009d0\u001cG\u009f\u008d\u001e\u0083\u0098;\u001bZ\u009a»\u0015ï\u0097(\u0016j\u0091¨\u0013S\u0092_\r\u0090\u008c×\u000eK\u0089R\b¿\u008bï\u0005,\u0084d\u0007ª±Ý0´³t2<´ë7«¶\\9V»ÿ:®½k?¾¾¶!g !\"ê¥\u0088$\u001a§\u0016)Á¨\u0096+\u0002\u00adà,î¯:±Ý0´³t2<´ë7«¶\\9V»ÿ:®½k?¾¾¶!g !\"ê¥\u0088$\u001a§\u0016)Á¨\u0096+\u0002\u00adà,î¯:.\u0015\u0090¶\u0013Ê\u0087ì\u0006·\u0085<\u0004$\u0082ç\u0001²\u0080^\u000f\u0003\u008dÏ\f\u009a\u008bG±û0µ³|2*´â7«¶K9\u001e±ê0¸³\u007f26´¼7ô±î0»³~2-´ì7·x¥ùþzuûu}½þæ\u007f\u0017ðHr\u0084óÕtEö·wíè8imë©\u0097ã\u0016¸\u00953\u0014(\u0092ì\u0011½\u0090[\u001f\u001e\u009dÍ\u001cÉ\u009b\\\u0019ö\u0098´\u0007jf?±î0µ³>2=´á7¡¶M9\u0004»É±¬±î0µ³>2,´ñ7«¶T9\u0012»\u0082:\u009a½R?ñ¾°!g +\"òIÿÈªKyÊ'LÞÏ¿N\u0005ÁEÔ\u0018UCÖÈWÚÑ\u0007R]Ó¢\\äÞt_zØ¿Z\u0006ÛED\u0081ÅÌG\u0000ÀxA¥ÂèL,\u0086\u008d\u0007É\u0084\b\u0005]\u0083\u0080\u0000Ý\u0081-\u000e/\u008c©\rø\u008a=\bÇ\u0089Å\u0016\u0001\u0097P\u0015\u0095\u0092ø\u0013%\u0090e±û0¿³~2+´ö7«¶[9)»Ô:Ò½\u0016?±¾§!v #\"Ù¥\u0084$\u0002§F)\u0081¨\u0083+G\u00adö,³¯~.#\u0090ã\u0013¡\u0092L\u0015J\u0097\u009e*Ö«\u0092(S©\u0006/Û¬\u0086-v¢t æ¡¨&b¤Ô%\u0095ºZ;:¹Ø>µ¿|<r²ä3¬°a6Ð·\u00894Hµ\u0004\u0086À\u0007\u0084\u0084E\u0005\u0010\u0083Í\u0000\u0090\u0081`\u000eb\u008cá\r³\u008at\bÝ\u0089×\u0016\u001f\u0097\u0003\u0015\u0092\u0092±\u0013c\u0090$\u001eí\u009fç\u001c/\u009aÓ #¡m\"§£ñ%0¦\u007f'Ï¨Ý*\u0010«Y,§®!/|°¢1ÿ³04Aµ½6Ð¸N9\nºÕ<'½k>º¿÷\u0001*\u0082O\u0003\u008f\u0084õ\u0006\b\u0087\u0006\b²¹.8u»þ:ì¼+?m¾\u008c1Ú³\u00032Kµ\u00847;¶f±î0µ³>2,´ë7\u00ad¶L9\u001f»Á:\u008b½G?û¾ú!p =\"ï¥\u0090$^§^)È¨\u008d+L\u00adÿ,³¯~.:\u0090ò\u0013\u0097\u0092Z\u0015\u0006\u008bY\n0\u0089ð\b¸\u008eo\r/\u008cØ\u0003ß\u0081P\u0000V\u0087\u0092±î0µ³>2,´ñ7«¶T9\u0012»\u0082:\u008e½I?í¾¤!~ )\"ÿ¥Ò$S§\u0014±è0¿³c2:´©±õ0´³y2:´ª7±¶N9\u0015»\u0082:\u009b½E?ó¾¡!? 8\"ô¥\u0093$J§\u0003\u009fÎ\u001e\u009c\u009d^\u001c\u0018\u009a\u0089\u0019\u0089\u0098l\u0017{\u0095â\u0014¨\u0093j\u0011Ó\u0090\u009c\u000fT\u008e\u0012\fÖ±í0¿³}2;´ª7±¶^9X»Ê:\u008b½K?û¾\u008b!q )\"ë¥\u0099$H§\u0011±í0¿³}2;´ª7±¶^9X»À:\u0089½D?Á¾°!w &\"õ¥\u0095$N§\t´ð5«¶ 7;±ÿ2®³H<\r¾Þ?Ú¸_:î»®$~¥9'ñ \u0086!\n¢\u001f,Õ\u00ad\u0097.I¨â±î0µ³>2,´ë7\u00ad¶L9X»Ý:\u008f½M?ë¾ú!s >\"â¥£$T§\u0011)Ã¨\u0081±î0µ³>2!´à7¯¶\u00169\u0014»Ù:\u0083½L?ú¾ú!t !\"è¥\u009b$_§\u0002)Þ¨\u0096+K\u00adö,¢íll7ï¼n¼ètk/êÞe\u0081çMf\u001cá\u008cc~â#}ùü¦~`ùPxÞû\u009buBô\u0001wÅñhp$óür¡ÌlO\bì\u008cm×î\\o_é\u009fjÓë.dqæ£g¦à b\u0089ãß|\u001cýN\u007fÊøøy1ú|t«õãv2ð\u008aqÆò\u0007sFÍ\u0096ÿJ~\u0011ý\u009a|\u0099úYy\u0015øèw·õet\u0011óáqBð\u0004o\u0098î\u008elWë1jòé°g$æ&eïãRb\u0015áÍ`\u009cÞT](Üù[¸Ùx®Å/\u009e¬\u0015-\u0013«Ê(\u0087©w&2¤õ%ï¢i À¡\u0096>U¿\u0007=\u0083º±;x¸56â·ª4{²Ã3\u008f°N1\u000f\u008fß±î0µ³>28´á7¬¶\\9\u0019»Þ:µ½D?ò¾¿!\u007f f\"ä¥\u0089$S§\u001c)Ê¨Ê+D\u00adñ,¸¯k./\u0090ò\u0013\u008e\u0092F\u0015\u001b\u0097Æ\u0016\u0092±´õ³tù±¦±µ±³0¾³u28´«7³¶]9\u001b»Ù:µ½P?÷¾¤!w±³0¾³u28´«7±¶W9\u0015»Ç:\u008f½T?±¾¶!s ;\"ã¥\u009e$[§\u001e)Ê¨»+E\u00adý,¸¯u..}\u0017ü\u001a\u007fÑþ\u009cx\u000fû\u0015zóõ±wcö+qðó\u0015r\u0017íÓl\u0082î[i<Ú¨[¥ØnY#ß°\\ªÝLR\u000eÐÜQ\u0094ÖOTªÕ¾JlË>IèÎ\u0083¥ä$þ§>&j ü#ä¢\n-L¯\u008e.â©\u0003+»ªâ5&´zc\u0098â\u0082aBà\u0016fÛå\u008cd~ëriëè¨oií\u009al\u0093óPr\u0001ðÎw\u0088ö|u:ûéz£ùf\u007fÐþ¢}Cü\u0004BÉÁ @xÇ\u0006EòÄ¨K\u001aÉÄHÕÏVN\u0000ª\u0093+\u009e¨U)\u0018¯\u008b,\u0080\u00adk\"\" Ó!\u00ad¦p$Í±³0¾³u28´«7 ¶K9\u0002»ó:\u009e½I?ó¾±±³0¾³u28´«7±¶W9\u0015»Ç:\u008f½T?±¾¶!a <\"à¥\u0093$V§\u0014)Ë¨\u0096+F±³0©³i2=´ð7§¶U9Y»À:\u0083½B?±¾¸!{ *\"ä¥\u008f$N§\u0016)Á¨\u0088+F\u00adý,¤¯S. \u0090î\u0013\u0097\u0092\u001a\u0015\u0001\u0097Ç\u000ez\u008fw\f¼\u008dñ\u000bb\u0088i\t\u0082\u0086Ë\u0004\u0004\u0085@\u0002\u008a\u00802\u007fHþE}\u008eüÃzPù[x°÷ùu0ôhs©ñ\nße^hÝ£\\îÚ}YvØ\u009dWÔÕ\u0017TYÓ\u0091Q&\u008di\fd\u008f¯\u000eâ\u0088q\u000bz\u008a\u0091\u0005Ø\u0087\u0019\u0006B\u0081\u0093\u0003!ÿ1~<ý÷|ºú)y\"øÉw\u0080õXt\u0005óÑq{\u0095\u0019\u0014\u0014\u0097ß\u0016\u0092\u0090\u0001\u0013\n\u0092á\u001d¨\u009fv\u001e'\u0099ë\u001b]\u009a\u000e\u0005Û\u001d=\u009c0\u001fû\u009e¶\u0018%\u009b.\u001aÅ\u0095\u008c\u0017}\u0096\r\u0011Ã\u0093uÊ\u008eK\u0083ÈLI\u0007ÏØLÐÍaB$ÀæA¹ÆqDÌÅ\u0088ZKÛ\u0006Y\u0094Þï_\u007fÜ/R¼Ó»PlÖÑW\u0080\u000f\u0002\u008e\u0006\rÏ\u008c\u008b\n\u001a\u0089\u0004\bà\u0087©\u0005y\u00844\u0003æ\u0081\\\u0000J\u009fá\u001e\u008a\u009cC\u001b\u001e\u009aã\u0019 \u0097m\u00160\u0095÷\u0013o\u0092\b\u0011Ñ\u0090\u009f.T\u00ad=±³0ª³b2!´ç7í¶Q9\u0019»Ü:\u0085½R?ê¾§ÕwTg×\u00adVµÐe±\u00990\u0080³H2\u000b´Í7Ç¶a99»ê:¦½%?Ù¾\u009f!H \u0011\u0094h\u0015;\u0096â\u0017±\u0091{\u0012>\u0093È\u001cË\u009eX\u001f\u0016\u0098ß\u001ai\u009b!\u0004è\u0085¨\u0007}\u0080A\u0001Ú\u0082\u008c±ð0³³r2\t´È7\u0087¶k9)»Î:\u0099½T?°¾§!}±³0¿³d2-´«7¯¶]9\u0012»Å:\u008b½\u007f?ý¾»!v -\"å¥\u008f$\u0014§\b)Ã¨\u00884äµ¬6\u007f·11í²¬3C¼\u000f>Ý¿\u0083±³0¿³d2-´«7¯¶W9\u0003»Â:\u009e½S[\u009fÚ\u0092Y]Ø\u0016^ÉÝÁ\\pÓ5Q÷Ð¨W`ÕÝT\u0099ËZJ\u0017È\u0085OþÎrM,Ã\u00adB©Á~GÄÆ\u0089E\u000eÄ\u001ezÁù¾±³0ª³b2!´ç7í¶[9\u0006»Ù:\u0083½N?ø¾»±Û0µ³|2*´â7«¶K9\u001e±³0¾³q2:´å7í¶U9\u001f»ß:\u0089½\u000f?î¾¦!} .\"ï¥\u0090$_§\u0003)\u0081¨\u0087+W\u00adê,ù¯<.e\u0090ã\u0013\u0091\u0092Y\u0015\\\u0097Å\u0016\u008f\u0099?\u001bè\u009a¿\u001dx\u009c-\u001eð\u0081\u008c\u0000\u0018\u0083\u0001\u0005Ï\u0084\u008d\u0007+\u0089ý\b¿\u008bm".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -7643444833193873190L;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(byte r5, int r6, short r7) {
            /*
                int r5 = r5 * 2
                int r5 = 4 - r5
                int r7 = r7 * 3
                int r7 = r7 + 109
                byte[] r0 = defpackage.addAllTags.$$c
                int r6 = r6 * 3
                int r1 = r6 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L16
                r4 = r6
                r3 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L22:
                int r3 = r3 + 1
                r4 = r0[r5]
            L26:
                int r4 = -r4
                int r7 = r7 + r4
                int r5 = r5 + 1
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.addAllTags.$$e(byte, int, short):java.lang.String");
        }
    }, new CaptureBundle(), new BinaryOperator() { // from class: validateCameras
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            ImmutableList.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (ImmutableList.TuitionPaymentFragmentbindingInflater1) obj;
            ImmutableList.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = (ImmutableList.TuitionPaymentFragmentbindingInflater1) obj2;
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentbindingInflater2.b);
            return tuitionPaymentFragmentbindingInflater1;
        }
    }, new Function() { // from class: CameraValidatorApi34Impl
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            ImmutableList.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (ImmutableList.TuitionPaymentFragmentbindingInflater1) obj;
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            return ImmutableList.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentbindingInflater1.b);
        }
    }, new Collector.Characteristics[0]);

    static {
        Collector.of(new Supplier() { // from class: CameraValidatorCameraIdListIncorrectException
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableSet.asBinder();
            }
        }, new BiConsumer() { // from class: CaptureConfig
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2) obj).TuitionPaymentFragmentbindingInflater1(obj2);
            }
        }, new BinaryOperator() { // from class: defaultEmptyCaptureConfig
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2) obj).TuitionPaymentFragmentbindingInflater1((ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2) obj2);
            }
        }, new Function() { // from class: getPreviewStabilizationMode
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2) obj).TuitionPaymentFragmentbindingInflater1();
            }
        }, new Collector.Characteristics[0]);
        Collector.of(new Supplier() { // from class: getCameraCaptureCallbacks
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableRangeSet.b();
            }
        }, new BiConsumer() { // from class: getTemplateType
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ImmutableRangeSet.b bVar = (ImmutableRangeSet.b) obj;
                Range range = (Range) obj2;
                if (!(!range.lowerBound.equals(range.upperBound))) {
                    throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("range must not be empty, but was %s", range));
                }
                bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(range);
            }
        }, new BinaryOperator() { // from class: CaptureConfigBuilder
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                ImmutableRangeSet.b bVar = (ImmutableRangeSet.b) obj;
                for (Range range : ((ImmutableRangeSet.b) obj2).TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    if (!(!range.lowerBound.equals(range.upperBound))) {
                        throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("range must not be empty, but was %s", range));
                    }
                    bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(range);
                }
                return bVar;
            }
        }, new Function() { // from class: getAvailableCameraCount
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Range rangeB;
                ImmutableRangeSet.b bVar = (ImmutableRangeSet.b) obj;
                ImmutableList.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new ImmutableList.TuitionPaymentFragmentbindingInflater1(bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size());
                Collections.sort(bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2, Range.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                Iterator it = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.iterator();
                addImplementationOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = it instanceof addImplementationOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1 ? (addImplementationOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1) it : new addImplementationOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1(it);
                while (true) {
                    if (!tuitionPaymentFragmentspecialinlinedviewModeldefault1.hasNext()) {
                        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                        ImmutableList immutableListTuitionPaymentFragmentbindingInflater1 = ImmutableList.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentbindingInflater1.b);
                        if (immutableListTuitionPaymentFragmentbindingInflater1.isEmpty()) {
                            return ImmutableRangeSet.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        }
                        if (immutableListTuitionPaymentFragmentbindingInflater1.size() == 1) {
                            Iterator<E> it2 = immutableListTuitionPaymentFragmentbindingInflater1.iterator();
                            Object next = it2.next();
                            if (it2.hasNext()) {
                                StringBuilder sb = new StringBuilder("expected one element but was: <");
                                sb.append(next);
                                for (int i = 0; i < 4 && it2.hasNext(); i++) {
                                    sb.append(", ");
                                    sb.append(it2.next());
                                }
                                if (it2.hasNext()) {
                                    sb.append(", ...");
                                }
                                sb.append(Typography.greater);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            if (((Range) next).equals(Range.b())) {
                                return ImmutableRangeSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            }
                        }
                        return new ImmutableRangeSet(immutableListTuitionPaymentFragmentbindingInflater1);
                    }
                    Range rangeB2 = (Range) tuitionPaymentFragmentspecialinlinedviewModeldefault1.next();
                    while (tuitionPaymentFragmentspecialinlinedviewModeldefault1.hasNext()) {
                        Range range = (Range) tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        if (rangeB2.lowerBound.compareTo(range.upperBound) > 0 || range.lowerBound.compareTo(rangeB2.upperBound) > 0) {
                            break;
                        }
                        int iCompareTo = rangeB2.lowerBound.compareTo(range.lowerBound);
                        int iCompareTo2 = rangeB2.upperBound.compareTo(range.upperBound);
                        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
                            rangeB = rangeB2;
                        } else if (iCompareTo > 0 || iCompareTo2 < 0) {
                            Cut cut = iCompareTo >= 0 ? rangeB2.lowerBound : range.lowerBound;
                            Cut cut2 = iCompareTo2 <= 0 ? rangeB2.upperBound : range.upperBound;
                            if (!(cut.compareTo(cut2) <= 0)) {
                                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("intersection is undefined for disconnected ranges %s and %s", rangeB2, range));
                            }
                            rangeB = Range.b(cut, cut2);
                        } else {
                            rangeB = range;
                        }
                        if (!rangeB.lowerBound.equals(rangeB.upperBound)) {
                            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Overlapping ranges not permitted but found %s overlapping %s", rangeB2, range));
                        }
                        Range range2 = (Range) tuitionPaymentFragmentspecialinlinedviewModeldefault1.next();
                        int iCompareTo3 = rangeB2.lowerBound.compareTo(range2.lowerBound);
                        int iCompareTo4 = rangeB2.upperBound.compareTo(range2.upperBound);
                        if (iCompareTo3 > 0 || iCompareTo4 < 0) {
                            rangeB2 = (iCompareTo3 < 0 || iCompareTo4 > 0) ? Range.b(iCompareTo3 <= 0 ? rangeB2.lowerBound : range2.lowerBound, iCompareTo4 >= 0 ? rangeB2.upperBound : range2.upperBound) : range2;
                        }
                    }
                    tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(rangeB2);
                }
            }
        }, new Collector.Characteristics[0]);
    }

    public static <E> Collector<E, ?, ImmutableList<E>> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return (Collector<E, ?, ImmutableList<E>>) TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
