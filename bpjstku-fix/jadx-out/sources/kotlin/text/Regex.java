package kotlin.text;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\r\b\u0007\u0018\u0000 82\u00060\u0001j\u0002`\u0002:\u000298B\u0011\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000bB\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\u0005\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000eH\u0086\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0004\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00172\u0006\u0010\u0004\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001c\u0010\u0016J\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010 J+\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000e2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0!H\u0007¢\u0006\u0004\b\u001f\u0010\"J\u001f\u0010#\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b#\u0010 J'\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070$2\u0006\u0010\u0004\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u0013H\u0007¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\u0006\u0010\u0004\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u0013H\u0007¢\u0006\u0004\b'\u0010\u0019J\u000f\u0010(\u001a\u00020\u0007H\u0017¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0003H\u0007¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0011\u00102\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b1\u0010)R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\t0\f8G¢\u0006\u0006\u001a\u0004\b5\u00106"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Ljava/util/regex/Pattern;", "p0", "<init>", "(Ljava/util/regex/Pattern;)V", "", "(Ljava/lang/String;)V", "Lkotlin/text/RegexOption;", "p1", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "", "(Ljava/lang/String;Ljava/util/Set;)V", "", "", "matches", "(Ljava/lang/CharSequence;)Z", "containsMatchIn", "", "Lkotlin/text/MatchResult;", "find", "(Ljava/lang/CharSequence;I)Lkotlin/text/MatchResult;", "Lkotlin/sequences/Sequence;", "findAll", "(Ljava/lang/CharSequence;I)Lkotlin/sequences/Sequence;", "matchEntire", "(Ljava/lang/CharSequence;)Lkotlin/text/MatchResult;", "matchAt", "matchesAt", "(Ljava/lang/CharSequence;I)Z", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "replaceFirst", "", "split", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "splitToSequence", "toString", "()Ljava/lang/String;", "toPattern", "()Ljava/util/regex/Pattern;", "", "writeReplace", "()Ljava/lang/Object;", "nativePattern", "Ljava/util/regex/Pattern;", "getPattern", "pattern", "_options", "Ljava/util/Set;", "getOptions", "()Ljava/util/Set;", "options", "Companion", "Serialized"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Regex implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Set<? extends RegexOption> _options;
    private final Pattern nativePattern;

    public Regex(Pattern pattern) {
        Intrinsics.checkNotNullParameter(pattern, "");
        this.nativePattern = pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Pattern patternCompile = Pattern.compile(str);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String str, RegexOption regexOption) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(regexOption, "");
        Pattern patternCompile = Pattern.compile(str, INSTANCE.ensureUnicodeCase(regexOption.getValue()));
        Intrinsics.checkNotNullExpressionValue(patternCompile, "");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String str, Set<? extends RegexOption> set) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        Pattern patternCompile = Pattern.compile(str, INSTANCE.ensureUnicodeCase(RegexKt.toInt(set)));
        Intrinsics.checkNotNullExpressionValue(patternCompile, "");
        this(patternCompile);
    }

    public final String getPattern() {
        String strPattern = this.nativePattern.pattern();
        Intrinsics.checkNotNullExpressionValue(strPattern, "");
        return strPattern;
    }

    public final Set<RegexOption> getOptions() {
        Set set = this._options;
        if (set != null) {
            return set;
        }
        final int iFlags = this.nativePattern.flags();
        EnumSet enumSetAllOf = EnumSet.allOf(RegexOption.class);
        Intrinsics.checkNotNull(enumSetAllOf);
        CollectionsKt.retainAll(enumSetAllOf, new Function1<RegexOption, Boolean>() { // from class: kotlin.text.Regex$special$$inlined$fromInt$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(RegexOption regexOption) {
                RegexOption regexOption2 = regexOption;
                return Boolean.valueOf((iFlags & regexOption2.getMask()) == regexOption2.getValue());
            }
        });
        Set<RegexOption> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "");
        this._options = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    public final boolean matches(CharSequence p0) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(p0, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Color.alpha(0) + 40, (ViewConfiguration.getJumpTapTimeout() >> 16) + 19, 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - TextUtils.getOffsetBefore("", 0)), 60 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 19 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.myTid() >> 22) + 37836), TextUtils.indexOf("", "", 0) + 59, 18 - View.MeasureSpec.getSize(0), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -115;
        long elapsedCpuTime = (int) Process.getElapsedCpuTime();
        long j3 = -1;
        long j4 = (j2 * 4450763898430259676L) + (j2 * 1068489598729526563L) + (((long) (-116)) * (((elapsedCpuTime ^ j3) | 4599384335441305087L) ^ j3));
        long j5 = 116;
        long j6 = j3 ^ 1068489598729526563L;
        long j7 = j4 + ((elapsedCpuTime | 4450763898430259676L) * j5) + (j5 * ((((j3 ^ 4450763898430259676L) | j6) ^ j3) | ((j6 | elapsedCpuTime) ^ j3)));
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j = j7;
        }
        if (i3 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - (ViewConfiguration.getScrollBarSize() >> 8)), (Process.myTid() >> 22) + 40, 19 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
        }
        return this.nativePattern.matcher(p0).matches();
    }

    /* JADX INFO: renamed from: kotlin.text.Regex$findAll$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<MatchResult, MatchResult> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Override // kotlin.jvm.functions.Function1
        public final MatchResult invoke(MatchResult matchResult) {
            Intrinsics.checkNotNullParameter(matchResult, "");
            return matchResult.next();
        }

        AnonymousClass2() {
            super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "", "readResolve", "()Ljava/lang/Object;", "pattern", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "flags", "I", "getFlags", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Serialized implements Serializable {
        private static int[] TuitionPaymentFragmentbindingInflater1;
        private static int b;
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;
        private static final byte[] $$c = {119, -103, 14, -22};
        private static final int $$f = 251;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {92, 126, -38, -95, -58, -6, -9, -3, -6, 17, -21, -9, -25, 34, -45, -14, 7, -17, -14, 43, -55, -1, 47, -9, -30, -44, -11, -4, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 59};
        private static final int $$e = 31;
        private static final byte[] $$a = {14, 116, 92, -78, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
        private static final int $$b = 244;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 52
                int r6 = r6 + 4
                byte[] r0 = kotlin.text.Regex.Serialized.$$a
                int r8 = r8 + 84
                int r7 = r7 * 52
                int r1 = r7 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r8 = r6
                r3 = r7
                r4 = r2
                goto L2c
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L23:
                r4 = r0[r6]
                int r3 = r3 + 1
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r6 = -r6
                int r3 = r3 + r6
                int r6 = r3 + (-11)
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.Serialized.a(byte, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(short r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = kotlin.text.Regex.Serialized.$$d
                int r7 = r7 * 28
                int r7 = 53 - r7
                int r8 = r8 * 17
                int r8 = r8 + 67
                int r6 = r6 + 4
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r7
                r4 = r2
                goto L28
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                int r6 = r6 + 1
                if (r4 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                r3 = r0[r6]
            L28:
                int r3 = -r3
                int r8 = r8 + r3
                int r8 = r8 + (-8)
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.Serialized.d(short, short, int, java.lang.Object[]):void");
        }

        private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = TuitionPaymentFragmentbindingInflater1;
            int i4 = -1870535734;
            int i5 = 1;
            int i6 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 3;
                    $10 = i8 % 128;
                    int i9 = i8 % i2;
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i6] = Integer.valueOf(iArr2[i7]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i6;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), 3291 - Color.green(i6), Color.blue(i6) + 31, 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i7++;
                        i2 = 2;
                        i4 = -1870535734;
                        i6 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i10 = 0;
                while (i10 < length3) {
                    try {
                        Object[] objArr3 = new Object[i5];
                        objArr3[0] = Integer.valueOf(iArr5[i10]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 3291, Gravity.getAbsoluteGravity(0, 0) + 31, 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i10++;
                        iArr5 = iArr5;
                        i5 = 1;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                iArr5 = iArr6;
            }
            char c = 0;
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                cArr[c] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                for (int i11 = 17; i11 > 1; i11--) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i11];
                    try {
                        Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                            int windowTouchSlop = 2559 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int i12 = 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            byte b6 = (byte) ($$f & 5);
                            byte b7 = (byte) (b6 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, windowTouchSlop, i12, 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                int i13 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i14 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr5 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28879), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 349, 24 - TextUtils.lastIndexOf("", '0', 0, 0), -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
                int i15 = $10 + 15;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                c = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public Serialized(String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            this.pattern = str;
            this.flags = i;
        }

        public final int getFlags() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                int iLastIndexOf = 875 - TextUtils.lastIndexOf("", '0', 0);
                int i4 = 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b2, b2, bArr[0], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, iLastIndexOf, i4, 252381699, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new int[]{-1464267111, -1805517393, -2087696698, -1437517351, 395191984, 161940227, -24545886, -1407517240, -1883142030, -1565907596, 952646491, 999302642, -1208795737, 584882402}, View.resolveSizeAndState(0, 0, 0) + 22, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new int[]{1849074853, 25544979, 1103544239, 129317057, -1622175085, 619552994, 1086720119, 422479459, -1413645318, 1332700048}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                int iRed = 876 - Color.red(0);
                int doubleTapTimeout = 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr5 = new Object[1];
                a(b3, bArr2[5], b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetAfter, iRed, doubleTapTimeout, 2009631821, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char mirror2 = (char) (AndroidCharacter.getMirror('0') - '0');
                    int iResolveOpacity = 876 - Drawable.resolveOpacity(0, 0);
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                    byte[] bArr3 = $$a;
                    Object[] objArr6 = new Object[1];
                    a(bArr3[5], bArr3[7], bArr3[10], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror2, iResolveOpacity, minimumFlingVelocity, 256017550, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iNextInt = new Random().nextInt(959437467);
                int i5 = ((((-1235001220) + (((~((-62770532) | iNextInt)) | 35963168) * (-140))) + ((~((-26807364) | iNextInt)) * 70)) + (((~(iNextInt | 103080760)) | (-93924956)) * 70)) - 1415433715;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new int[]{-1661842468, -614090596, -474999790, -758984318, -431535059, -2089653140, 1844951763, 68411976, 115258104, -1597081442, 2044099959, 459413633, -909881140, 1229524820, 256666916, 1556925375}, Process.getGidForName("") + 27, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new int[]{-594842622, 1475099555, 860123199, 1316073345, 1182014255, 466994341, -773961029, -39791410, 920931890, -548661489, 1836086641, 626756832}, 18 - View.MeasureSpec.getSize(0), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                    int i9 = i8 % 2;
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                c(new int[]{1989328595, 1382707955, 695435657, -972369610, 1176679733, -1293833992, 1054241702, -1410280531, 963861491, 919205110}, 16 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new int[]{-408562882, -1219493574, 2098627738, 254372954, -436764538, 1809786600, -1751045363, -88458539, 2036090255, -1092535936}, View.combineMeasuredStates(0, 0) + 16, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), -1415433715};
                    byte[] bArr4 = $$d;
                    Object[] objArr13 = new Object[1];
                    d(bArr4[21], bArr4[61], bArr4[38], objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    d((byte) ($$e & 119), bArr4[38], bArr4[61], objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
                            int iIndexOf = TextUtils.indexOf("", "", 0) + 10;
                            byte[] bArr5 = $$a;
                            Object[] objArr16 = new Object[1];
                            a(bArr5[5], bArr5[7], bArr5[10], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, absoluteGravity, iIndexOf, 256017550, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(new int[]{-1464267111, -1805517393, -2087696698, -1437517351, 395191984, 161940227, -24545886, -1407517240, -1883142030, -1565907596, 952646491, 999302642, -1208795737, 584882402}, 22 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(new int[]{1849074853, 25544979, 1103544239, 129317057, -1622175085, 619552994, 1086720119, 422479459, -1413645318, 1332700048}, 15 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                int trimmedLength = TextUtils.getTrimmedLength("") + 876;
                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                                byte[] bArr6 = $$a;
                                byte b4 = bArr6[7];
                                Object[] objArr19 = new Object[1];
                                a(b4, bArr6[5], b4, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, trimmedLength, edgeSlop, 2009631821, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int doubleTapTimeout2 = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int i10 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                byte[] bArr7 = $$a;
                                byte b5 = bArr7[7];
                                Object[] objArr20 = new Object[1];
                                a(b5, b5, bArr7[0], objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity2, doubleTapTimeout2, i10, 252381699, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i11 = ((int[]) objArr[2])[0];
            int i12 = ((int[]) objArr[0])[0];
            if (i12 == i11) {
                int i13 = ((int[]) objArr[1])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i14 = ~iIdentityHashCode;
                int i15 = i13 + 629539536 + (((~((-382767558) | i14)) | (~(342457328 | i14))) * (-867)) + (((~((-382767558) | iIdentityHashCode)) | 43024389 | (~(342457328 | iIdentityHashCode))) * (-1734)) + (((~(iIdentityHashCode | 385481717)) | (~(i14 | (-43024390))) | (~((-339743169) | iIdentityHashCode))) * 867);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr21[1])[0] = i17 ^ (i17 << 5);
                int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                int i19 = i18 % 2;
            } else {
                int[] iArr = new int[i12];
                int i20 = i12 - 1;
                iArr[i20] = 1;
                Toast.makeText((Context) null, iArr[((i12 * i20) % 2) - 1], 1).show();
                int i21 = ((int[]) objArr[1])[0];
                Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i22 = (~(771295150 | iIdentityHashCode2)) | 268441601;
                int i23 = ~iIdentityHashCode2;
                int i24 = i21 + (-141298622) + ((i22 | (~((-228131373) | i23))) * 886) + (((~(i23 | (-771295151))) | 811605379) * (-1772)) + ((~(i23 | 811605379)) * 886);
                int i25 = (i24 << 13) ^ i24;
                int i26 = i25 ^ (i25 >>> 17);
                ((int[]) objArr22[1])[0] = i26 ^ (i26 << 5);
            }
            return this.flags;
        }

        public final String getPattern() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            String str = this.pattern;
            int i5 = i3 + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final Object readResolve() {
            int i = 2 % 2;
            Pattern patternCompile = Pattern.compile(this.pattern, this.flags);
            Intrinsics.checkNotNullExpressionValue(patternCompile, "");
            Regex regex = new Regex(patternCompile);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            return regex;
        }

        static {
            b = 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            INSTANCE = new Companion(null);
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
            b = i % 128;
            int i2 = i % 2;
        }

        static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            TuitionPaymentFragmentbindingInflater1 = new int[]{1838321017, -643863983, -170514292, -2092815292, 1686644781, -1091629859, -466185375, -110530737, -137500089, 1947571017, -1837400595, -705622861, 394595668, 915061973, 1904491142, -1104114693, 1235438516, -1021544756};
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, byte r7, int r8) {
            /*
                int r8 = r8 * 4
                int r0 = r8 + 1
                byte[] r1 = kotlin.text.Regex.Serialized.$$c
                int r6 = r6 * 56
                int r6 = r6 + 66
                int r7 = r7 * 4
                int r7 = 3 - r7
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2b
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L24:
                int r7 = r7 + 1
                r3 = r1[r7]
                r5 = r3
                r3 = r7
                r7 = r5
            L2b:
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.Serialized.$$g(int, byte, int):java.lang.String");
        }
    }

    public final boolean containsMatchIn(CharSequence p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.nativePattern.matcher(p0).find();
    }

    public static /* synthetic */ MatchResult find$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.find(charSequence, i);
    }

    public final MatchResult find(CharSequence p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Matcher matcher = this.nativePattern.matcher(p0);
        Intrinsics.checkNotNullExpressionValue(matcher, "");
        return RegexKt.findNext(matcher, p1, p0);
    }

    public static /* synthetic */ Sequence findAll$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.findAll(charSequence, i);
    }

    public final Sequence<MatchResult> findAll(final CharSequence p0, final int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 < 0 || p1 > p0.length()) {
            StringBuilder sb = new StringBuilder("Start index out of bounds: ");
            sb.append(p1);
            sb.append(", input length: ");
            sb.append(p0.length());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return SequencesKt.generateSequence(new Function0() { // from class: kotlin.text.Regex$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.find(p0, p1);
            }
        }, (Function1) AnonymousClass2.INSTANCE);
    }

    public final MatchResult matchEntire(CharSequence p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Matcher matcher = this.nativePattern.matcher(p0);
        Intrinsics.checkNotNullExpressionValue(matcher, "");
        return RegexKt.matchEntire(matcher, p0);
    }

    public final MatchResult matchAt(CharSequence p0, int p1) {
        MatcherMatchResult matcherMatchResult;
        Intrinsics.checkNotNullParameter(p0, "");
        Matcher matcherRegion = this.nativePattern.matcher(p0).useAnchoringBounds(false).useTransparentBounds(true).region(p1, p0.length());
        if (matcherRegion.lookingAt()) {
            Intrinsics.checkNotNull(matcherRegion);
            matcherMatchResult = new MatcherMatchResult(matcherRegion, p0);
        } else {
            matcherMatchResult = null;
        }
        return matcherMatchResult;
    }

    public final boolean matchesAt(CharSequence p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.nativePattern.matcher(p0).useAnchoringBounds(false).useTransparentBounds(true).region(p1, p0.length()).lookingAt();
    }

    /* JADX INFO: renamed from: kotlin.text.Regex$splitToSequence$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {279, 287, 291}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> {
        final /* synthetic */ CharSequence $input;
        final /* synthetic */ int $limit;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: Code duplicated, block: B:19:0x0072 A[PHI: r1 r6 r10
  0x0072: PHI (r1v8 int) = (r1v7 int), (r1v13 int) binds: [B:18:0x0070, B:10:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0072: PHI (r6v2 kotlin.sequences.SequenceScope) = (r6v1 kotlin.sequences.SequenceScope), (r6v4 kotlin.sequences.SequenceScope) binds: [B:18:0x0070, B:10:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0072: PHI (r10v7 java.util.regex.Matcher) = (r10v6 java.util.regex.Matcher), (r10v13 java.util.regex.Matcher) binds: [B:18:0x0070, B:10:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:21:0x007c  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
        
            if (r6.yield(r10.subSequence(r5, r10.length()).toString(), r9) != r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
        
            if (r10.yield(r9.$input.toString(), r9) == r0) goto L29;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0070 -> B:19:0x0072). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2d
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.ResultKt.throwOnFailure(r10)
                goto La0
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                int r1 = r9.I$0
                java.lang.Object r5 = r9.L$1
                java.util.regex.Matcher r5 = (java.util.regex.Matcher) r5
                java.lang.Object r6 = r9.L$0
                kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = r5
                goto L72
            L2d:
                kotlin.ResultKt.throwOnFailure(r10)
                goto Lb5
            L32:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                kotlin.sequences.SequenceScope r10 = (kotlin.sequences.SequenceScope) r10
                kotlin.text.Regex r1 = kotlin.text.Regex.this
                java.util.regex.Pattern r1 = kotlin.text.Regex.access$getNativePattern$p(r1)
                java.lang.CharSequence r5 = r9.$input
                java.util.regex.Matcher r1 = r1.matcher(r5)
                int r5 = r9.$limit
                if (r5 == r4) goto La3
                boolean r5 = r1.find()
                if (r5 == 0) goto La3
                r5 = 0
                r6 = r10
                r10 = r1
                r1 = r5
            L53:
                java.lang.CharSequence r7 = r9.$input
                int r8 = r10.start()
                java.lang.CharSequence r5 = r7.subSequence(r5, r8)
                java.lang.String r5 = r5.toString()
                r7 = r9
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                r9.L$0 = r6
                r9.L$1 = r10
                r9.I$0 = r1
                r9.label = r3
                java.lang.Object r5 = r6.yield(r5, r7)
                if (r5 == r0) goto Lb4
            L72:
                int r5 = r10.end()
                int r1 = r1 + r4
                int r7 = r9.$limit
                int r7 = r7 - r4
                if (r1 == r7) goto L82
                boolean r7 = r10.find()
                if (r7 != 0) goto L53
            L82:
                java.lang.CharSequence r10 = r9.$input
                int r1 = r10.length()
                java.lang.CharSequence r10 = r10.subSequence(r5, r1)
                java.lang.String r10 = r10.toString()
                r1 = r9
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r3 = 0
                r9.L$0 = r3
                r9.L$1 = r3
                r9.label = r2
                java.lang.Object r10 = r6.yield(r10, r1)
                if (r10 == r0) goto Lb4
            La0:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            La3:
                java.lang.CharSequence r1 = r9.$input
                java.lang.String r1 = r1.toString()
                r2 = r9
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r9.label = r4
                java.lang.Object r10 = r10.yield(r1, r2)
                if (r10 != r0) goto Lb5
            Lb4:
                return r0
            Lb5:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CharSequence charSequence, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$input = charSequence;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = Regex.this.new AnonymousClass1(this.$input, this.$limit, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super String> sequenceScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final String replace(CharSequence p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        String strReplaceAll = this.nativePattern.matcher(p0).replaceAll(p1);
        Intrinsics.checkNotNullExpressionValue(strReplaceAll, "");
        return strReplaceAll;
    }

    public final String replace(CharSequence p0, Function1<? super MatchResult, ? extends CharSequence> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        int iIntValue = 0;
        MatchResult matchResultFind$default = find$default(this, p0, 0, 2, null);
        if (matchResultFind$default == null) {
            return p0.toString();
        }
        int length = p0.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(p0, iIntValue, matchResultFind$default.getRange().getStart().intValue());
            sb.append(p1.invoke(matchResultFind$default));
            iIntValue = matchResultFind$default.getRange().getEndInclusive().intValue() + 1;
            matchResultFind$default = matchResultFind$default.next();
            if (iIntValue >= length) {
                break;
            }
        } while (matchResultFind$default != null);
        if (iIntValue < length) {
            sb.append(p0, iIntValue, length);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlin/text/Regex$Companion;", "", "<init>", "()V", "", "p0", "Lkotlin/text/Regex;", "fromLiteral", "(Ljava/lang/String;)Lkotlin/text/Regex;", "escape", "(Ljava/lang/String;)Ljava/lang/String;", "escapeReplacement", "", "ensureUnicodeCase", "(I)I"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final int ensureUnicodeCase(int p0) {
            return (p0 & 2) != 0 ? p0 | 64 : p0;
        }

        private Companion() {
        }

        public final Regex fromLiteral(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new Regex(p0, RegexOption.LITERAL);
        }

        public final String escape(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            String strQuote = Pattern.quote(p0);
            Intrinsics.checkNotNullExpressionValue(strQuote, "");
            return strQuote;
        }

        public final String escapeReplacement(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            String strQuoteReplacement = Matcher.quoteReplacement(p0);
            Intrinsics.checkNotNullExpressionValue(strQuoteReplacement, "");
            return strQuoteReplacement;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String replaceFirst(CharSequence p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        String strReplaceFirst = this.nativePattern.matcher(p0).replaceFirst(p1);
        Intrinsics.checkNotNullExpressionValue(strReplaceFirst, "");
        return strReplaceFirst;
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.split(charSequence, i);
    }

    public final List<String> split(CharSequence p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        StringsKt.requireNonNegativeLimit(p1);
        Matcher matcher = this.nativePattern.matcher(p0);
        if (p1 == 1 || !matcher.find()) {
            return CollectionsKt.listOf(p0.toString());
        }
        ArrayList arrayList = new ArrayList(p1 > 0 ? RangesKt.coerceAtMost(p1, 10) : 10);
        int i = p1 - 1;
        int iEnd = 0;
        do {
            arrayList.add(p0.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i >= 0 && arrayList.size() == i) {
                break;
            }
        } while (matcher.find());
        arrayList.add(p0.subSequence(iEnd, p0.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ Sequence splitToSequence$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.splitToSequence(charSequence, i);
    }

    public final Sequence<String> splitToSequence(CharSequence p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        StringsKt.requireNonNegativeLimit(p1);
        return SequencesKt.sequence(new AnonymousClass1(p0, p1, null));
    }

    public final String toString() {
        String string = this.nativePattern.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX INFO: renamed from: toPattern, reason: from getter */
    public final Pattern getNativePattern() {
        return this.nativePattern;
    }

    private final Object writeReplace() {
        String strPattern = this.nativePattern.pattern();
        Intrinsics.checkNotNullExpressionValue(strPattern, "");
        return new Serialized(strPattern, this.nativePattern.flags());
    }
}
