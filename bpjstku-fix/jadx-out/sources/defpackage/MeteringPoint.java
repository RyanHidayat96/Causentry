package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.LongTaskEvent;
import com.datadog.android.rum.model.ResourceEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.telemetry.model.TelemetryConfigurationEvent;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.datadog.android.telemetry.model.TelemetryUsageEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\b\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"Bo\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0001\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH×\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010\"\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001f"}, d2 = {"LMeteringPoint;", "LgetOffsetY;", "", "Lcom/datadog/android/rum/model/ViewEvent;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent;", "p1", "Lcom/datadog/android/rum/model/ResourceEvent;", "p2", "Lcom/datadog/android/rum/model/ActionEvent;", "p3", "Lcom/datadog/android/rum/model/LongTaskEvent;", "p4", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent;", "p5", "Lcom/datadog/android/api/InternalLogger;", "p6", "<init>", "(LgetOffsetY;LgetOffsetY;LgetOffsetY;LgetOffsetY;LgetOffsetY;LgetOffsetY;Lcom/datadog/android/api/InternalLogger;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LgetOffsetY;", "b", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "g", "asBinder", "a"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class MeteringPoint implements getOffsetY<Object> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] asInterface;
    private static int cancel;
    private static char d;
    private final getOffsetY<ActionEvent> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final getOffsetY<ErrorEvent> b;
    private final getOffsetY<LongTaskEvent> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final getOffsetY<ViewEvent> a;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final getOffsetY<TelemetryConfigurationEvent> g;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final getOffsetY<ResourceEvent> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {22, 102, 43, -6};
    private static final int $$f = 193;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {32, 1, 70, -122, -7, 22, -27, 26, 18, -4, 3, 26, -4, 12, 0, -30, 58, 4, 8, 8, -27, 26, 19, 11, -9, 21, 8, 6, 40, -5, 18, -4, 13, 6, -23, 24, 31, -5, -1, 16, 13, -39, 51, -10, 13, 13, -1, 16, 13, -11, 14, 12, -3, 12, 12, 0, -23, 44, -1, 13, -4, 26, -8, 20, -58};
    private static final int $$e = 219;
    private static final byte[] $$a = {83, -44, 103, 46, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 17;
    private static int cancelAll = 0;
    private static int notify = 1;
    private static int INotificationSideChannel = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.MeteringPoint.$$a
            int r7 = r7 * 52
            int r7 = r7 + 4
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r5 = r5 * 52
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r5
            r4 = r7
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
        L29:
            int r7 = r7 + 1
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MeteringPoint.c(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 31
            int r6 = 115 - r6
            int r7 = r7 * 13
            int r0 = 38 - r7
            int r8 = r8 * 24
            int r8 = 28 - r8
            byte[] r1 = defpackage.MeteringPoint.$$d
            byte[] r0 = new byte[r0]
            int r7 = 37 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r8 = r8 + r4
            int r8 = r8 + (-7)
            int r6 = r6 + 1
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MeteringPoint.f(byte, byte, short, java.lang.Object[]):void");
    }

    public MeteringPoint(getOffsetY<ViewEvent> getoffsety, getOffsetY<ErrorEvent> getoffsety2, getOffsetY<ResourceEvent> getoffsety3, getOffsetY<ActionEvent> getoffsety4, getOffsetY<LongTaskEvent> getoffsety5, getOffsetY<TelemetryConfigurationEvent> getoffsety6, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(getoffsety, "");
        Intrinsics.checkNotNullParameter(getoffsety2, "");
        Intrinsics.checkNotNullParameter(getoffsety3, "");
        Intrinsics.checkNotNullParameter(getoffsety4, "");
        Intrinsics.checkNotNullParameter(getoffsety5, "");
        Intrinsics.checkNotNullParameter(getoffsety6, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.a = getoffsety;
        this.b = getoffsety2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getoffsety3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getoffsety4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getoffsety5;
        this.g = getoffsety6;
        this.TuitionPaymentFragmentbindingInflater1 = internalLogger;
    }

    public /* synthetic */ MeteringPoint(getOffsetY getoffsety, getOffsetY getoffsety2, getOffsetY getoffsety3, getOffsetY getoffsety4, getOffsetY getoffsety5, getOffsetY getoffsety6, InternalLogger internalLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        getOffsetY getoffsety7;
        getOffsetY getoffsety8;
        getOffsetY layoutSettingsBuilder;
        getOffsetY getoffsety9;
        if ((i & 1) != 0) {
            LayoutSettingsBuilder layoutSettingsBuilder2 = new LayoutSettingsBuilder();
            int i2 = notify + 75;
            cancelAll = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            getoffsety7 = layoutSettingsBuilder2;
        } else {
            getoffsety7 = getoffsety;
        }
        getOffsetY layoutSettingsBuilder3 = (i & 2) != 0 ? new LayoutSettingsBuilder() : getoffsety2;
        if ((i & 4) != 0) {
            LayoutSettingsBuilder layoutSettingsBuilder4 = new LayoutSettingsBuilder();
            int i4 = cancelAll + 61;
            notify = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            getoffsety8 = layoutSettingsBuilder4;
        } else {
            getoffsety8 = getoffsety3;
        }
        if ((i & 8) != 0) {
            int i6 = 2 % 2;
            layoutSettingsBuilder = new LayoutSettingsBuilder();
        } else {
            layoutSettingsBuilder = getoffsety4;
        }
        getOffsetY layoutSettingsBuilder5 = (i & 16) != 0 ? new LayoutSettingsBuilder() : getoffsety5;
        if ((i & 32) != 0) {
            LayoutSettingsBuilder layoutSettingsBuilder6 = new LayoutSettingsBuilder();
            int i7 = notify + 31;
            cancelAll = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            getoffsety9 = layoutSettingsBuilder6;
        } else {
            getoffsety9 = getoffsety6;
        }
        this(getoffsety7, layoutSettingsBuilder3, getoffsety8, layoutSettingsBuilder, layoutSettingsBuilder5, getoffsety9, internalLogger);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bf  */
    @Override // defpackage.getOffsetY
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(final Object p0) {
        boolean z;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        boolean z2 = p0 instanceof ViewEvent;
        if (z2) {
            int i2 = cancelAll + 29;
            notify = i2 % 128;
            int i3 = i2 % 2;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.a.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
        } else if (p0 instanceof ActionEvent) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
        } else if (p0 instanceof ErrorEvent) {
            ErrorEvent errorEventTuitionPaymentFragmentspecialinlinedviewModeldefault2 = (ErrorEvent) p0;
            if (Intrinsics.areEqual(errorEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.cancelAll.a, Boolean.TRUE)) {
                int i4 = notify + 5;
                cancelAll = i4 % 128;
                int i5 = i4 % 2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = (ErrorEvent) this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                    this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventMapper$mapRumEvent$1
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "RumEventMapper: the return from the ErrorEvent mapper was null for a crash. Dropping crashes in from the event mapper is not supported. The original event object will be used instead.";
                        }
                    }, null, false, null);
                }
            } else {
                errorEventTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
                int i6 = cancelAll + 105;
                notify = i6 % 128;
                int i7 = i6 % 2;
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = errorEventTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        } else if (p0 instanceof ResourceEvent) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
        } else if (p0 instanceof LongTaskEvent) {
            int i8 = notify + 103;
            cancelAll = i8 % 128;
            int i9 = i8 % 2;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
        } else if (p0 instanceof TelemetryConfigurationEvent) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
        } else {
            if (!(p0 instanceof TelemetryDebugEvent)) {
                if (!(p0 instanceof TelemetryUsageEvent)) {
                    z = p0 instanceof TelemetryErrorEvent;
                }
                if (!z) {
                    this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.WARN, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventMapper$mapRumEvent$2
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            String str = String.format(Locale.US, "RumEventMapper: there was no EventMapper assigned for RUM event type: %s", Arrays.copyOf(new Object[]{p0.getClass().getSimpleName()}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "");
                            return str;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, null, false, null);
                }
                objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = p0;
            } else {
                int i10 = notify + 105;
                cancelAll = i10 % 128;
                int i11 = i10 % 2;
            }
            z = true;
            if (!z) {
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.WARN, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventMapper$mapRumEvent$2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        String str = String.format(Locale.US, "RumEventMapper: there was no EventMapper assigned for RUM event type: %s", Arrays.copyOf(new Object[]{p0.getClass().getSimpleName()}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        return str;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, null, false, null);
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = p0;
        }
        if (z2 && (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null || objTuitionPaymentFragmentspecialinlinedviewModeldefault2 != p0)) {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventMapper$resolveEvent$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "RumEventMapper: the returned mapped ViewEvent was null. The original event object will be used instead: %s", Arrays.copyOf(new Object[]{p0}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, null, false, null);
        } else {
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventMapper$resolveEvent$2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        String str = String.format(Locale.US, "RumEventMapper: the returned mapped object was null. This event will be dropped: %s", Arrays.copyOf(new Object[]{p0}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        return str;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, null, false, null);
                return null;
            }
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 != p0) {
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventMapper$resolveEvent$3
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        String str = String.format(Locale.US, "RumEventMapper: the returned mapped object was not the same instance as the original object. This event will be dropped: %s", Arrays.copyOf(new Object[]{p0}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        return str;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, null, false, null);
                return null;
            }
        }
        return p0;
    }

    /* JADX INFO: renamed from: MeteringPoint$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LMeteringPoint$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            nativeGetSurfaceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] = getSurfaceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0];
        }
    }

    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = asInterface;
        Object obj2 = null;
        int i5 = 3;
        if (cArr2 != null) {
            int i6 = $11 + 115;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 87;
                $11 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i5;
                        byte b3 = (byte) (b2 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.myTid() >> 22), Color.green(0) + 2267, 33 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1927765101, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i3 = 2;
                    i5 = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(d)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b4 = (byte) 3;
            byte b5 = (byte) (b4 - 4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), View.resolveSizeAndState(0, 0, 0) + 2267, (-16777183) - Color.rgb(0, 0, 0), -1927765101, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i11 = $10 + 73;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 2;
                        byte b7 = (byte) (b6 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 49268), 3261 - TextUtils.indexOf("", "", 0), 29 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -127612708, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        try {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = (byte) (b8 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - TextUtils.getOffsetBefore("", 0)), 594 - (Process.myPid() >> 22), 17 - (Process.myPid() >> 22), 1570859318, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                        } else {
                            int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                int i18 = $11 + 89;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                obj2 = obj;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0239  */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    public final boolean equals(Object p0) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = cancelAll + 15;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 37568);
            int maximumDrawingCacheSize = 625 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 14;
            byte b = $$a[7];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            c(b, b2, b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, maximumDrawingCacheSize, iCombineMeasuredStates, -477065106, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{11, '!', '*', 29, 17, 31, ',', 15, 11, '\t', 17, ',', '+', '\r', ')', '#', '.', 11, 31, '\f', 1, '%'}, (byte) ('r' - AndroidCharacter.getMirror('0')), TextUtils.lastIndexOf("", '0', 0, 0) + 23, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{'(', Typography.quote, '\b', 5, '\r', Typography.dollar, '/', 22, '(', '\r', '(', '/', 25, Typography.amp, 13943}, (byte) (120 - Gravity.getAbsoluteGravity(0, 0)), TextUtils.lastIndexOf("", '0', 0) + 16, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mode = (char) (37567 - View.MeasureSpec.getMode(0));
            int i4 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 624;
            int iAlpha = Color.alpha(0) + 14;
            byte[] bArr = $$a;
            byte b3 = bArr[5];
            Object[] objArr6 = new Object[1];
            c(b3, b3, bArr[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, i4, iAlpha, -976899241, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = cancelAll + 85;
            notify = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37566);
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 625;
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 14;
                byte b4 = $$a[5];
                byte b5 = b4;
                Object[] objArr7 = new Object[1];
                c(b4, b5, b5, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, maxKeyCode, packedPositionGroup, -973632554, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr8[2])[0];
            int i8 = ((int[]) objArr8[0])[0];
            String[] strArr = (String[]) objArr8[3];
            int[] iArr = {i8};
            int iMyTid = Process.myTid();
            int i9 = (((378411976 + (((~((-1301640622) | iMyTid)) | 219418889) * 336)) + (((~(iMyTid | 522097499)) | (-1604319232)) * (-168))) + (((~((~iMyTid) | 522097499)) | (-1301640622)) * 168)) - 2077285354;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i7}, strArr};
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{11, '!', '*', 29, 17, 31, ',', 15, '\b', 5, 2, 15, 16, 6, Typography.amp, 26, 31, 27, ')', '/', 16, 2, Typography.quote, '#', '\b', '/'}, (byte) (KeyEvent.getDeadChar(0, 0) + 31), 26 - TextUtils.indexOf("", "", 0), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{1, 23, 13852, 13852, '\'', Typography.quote, ')', 19, 13854, 13854, 31, 26, 5, '\t', Typography.amp, 26, 11, 31}, (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 52), 18 - Color.argb(0, 0, 0, 0), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i12 = notify + 83;
                    cancelAll = i12 % 128;
                    int i13 = i12 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr11 = new Object[1];
            e(new char[]{'\f', '\r', '!', '\r', 19, 30, 11, '!', 23, 20, '.', '*', '\f', Typography.dollar, '#', '('}, (byte) (85 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 17, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(new char[]{22, '-', '\'', Typography.quote, Typography.amp, 26, ')', '/', 19, 7, '\t', '+', 3, 11, '0', Typography.dollar}, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 89), (Process.myTid() >> 22) + 16, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr13 = new Object[1];
            e(new char[]{'0', '(', 5, '\n', '\t', '!', 5, 17, 17, 1, 4, 17, 13909, 13909, 11, 19, 3, '(', 20, '(', 19, 4, 2, '!', '(', 6, 31, '%', '+', ',', Typography.dollar, 22, 19, '\b', '+', 19, 13825, 13825, 19, '\n', 4, 17, 31, 15, 6, Typography.amp, '.', 14, 7, 5, 19, '\n', 31, 15, ',', '!', 16, 18, 30, 31, 31, 2, ',', '!'}, (byte) (86 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 65 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr13);
            String str = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            e(new char[]{5, '\t', '/', 15, 4, 14, '!', 2, Typography.amp, 6, 2, 28, '(', '0', 1, 31, '0', '+', 14, '/', 19, 4, 5, 17, 31, 30, 29, 16, '+', 14, 16, 18, 16, 29, 17, '\'', Typography.quote, Typography.dollar, 19, 5, '0', '(', 5, 17, 1, '!', 13852, 13852, 16, 1, 13846, 13846, 31, 30, '+', '0', 3, 4, '+', '!', 7, 5, 17, 5}, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 115), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 63, objArr14);
            try {
                Object[] objArr15 = {applicationContext, new String[]{str, (String) objArr14[0]}, Integer.valueOf(iIntValue), 17, -2077285354};
                byte[] bArr2 = $$d;
                byte b6 = bArr2[14];
                byte b7 = bArr2[1];
                Object[] objArr16 = new Object[1];
                f(b6, b7, b7, objArr16);
                Class<?> cls4 = Class.forName((String) objArr16[0]);
                byte b8 = bArr2[1];
                byte b9 = bArr2[14];
                Object[] objArr17 = new Object[1];
                f(b8, b9, b9, objArr17);
                objArr = (Object[]) cls4.getMethod((String) objArr17[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr15);
                int i14 = ((int[]) objArr[0])[0];
                int i15 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) (37568 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int scrollDefaultDelay = 625 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14;
                        byte b10 = $$a[5];
                        byte b11 = b10;
                        Object[] objArr18 = new Object[1];
                        c(b10, b11, b11, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, scrollDefaultDelay, scrollBarFadeDuration, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr19 = new Object[1];
                        e(new char[]{11, '!', '*', 29, 17, 31, ',', 15, 11, '\t', 17, ',', '+', '\r', ')', '#', '.', 11, 31, '\f', 1, '%'}, (byte) (66 - Color.alpha(0)), MotionEvent.axisFromString("") + 23, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        e(new char[]{'(', Typography.quote, '\b', 5, '\r', Typography.dollar, '/', 22, '(', '\r', '(', '/', 25, Typography.amp, 13943}, (byte) (Drawable.resolveOpacity(0, 0) + 120), AndroidCharacter.getMirror('0') - '!', objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 37567);
                            int i16 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 625;
                            int packedPositionGroup2 = 14 - ExpandableListView.getPackedPositionGroup(0L);
                            byte[] bArr3 = $$a;
                            byte b12 = bArr3[5];
                            Object[] objArr21 = new Object[1];
                            c(b12, b12, bArr3[7], objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(fadingEdgeLength, i16, packedPositionGroup2, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 37566);
                            int i17 = 625 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int fadingEdgeLength2 = 14 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            byte b13 = $$a[7];
                            byte b14 = b13;
                            Object[] objArr22 = new Object[1];
                            c(b13, b14, b14, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, i17, fadingEdgeLength2, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[2])[0];
        if (i19 == i18) {
            int i20 = ((int[]) objArr[1])[0];
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i21};
            int iMyPid = Process.myPid();
            int i23 = ~iMyPid;
            int i24 = i20 + 378411976 + (((~((-1153053357) | i23)) | 79172108) * 168) + ((~((-79172109) | iMyPid)) * 168) + (((~(iMyPid | (-1073881249))) | (~(i23 | (-670684765))) | 591512656) * 168);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr2[1])[0] = i26 ^ (i26 << 5);
            objArr2 = new Object[]{new int[]{i22}, new int[1], iArr2, strArr2};
        } else {
            int i27 = 3;
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i28 = 0;
                while (i28 < strArr3.length) {
                    int i29 = cancelAll + i27;
                    notify = i29 % 128;
                    int i30 = i29 % 2;
                    arrayList.add(strArr3[i28]);
                    i28++;
                    i27 = 3;
                }
            }
            int[] iArr3 = new int[i19];
            int i31 = i19 - 1;
            iArr3[i31] = 1;
            Toast.makeText((Context) null, iArr3[((i19 * i31) % 2) - 1], 1).show();
            int i32 = ((int[]) objArr[1])[0];
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[0])[0];
            String[] strArr4 = (String[]) objArr[3];
            int iIdentityHashCode = System.identityHashCode(this);
            int i35 = i32 + 1282930588 + (((~((-1048221796) | iIdentityHashCode)) | (-1048312040)) * (-502)) + ((~((~iIdentityHashCode) | (-272795715))) * (-502)) + (((~(iIdentityHashCode | (-775516326))) | (-1048221796)) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr2[1])[0] = i37 ^ (i37 << 5);
            objArr2 = new Object[]{new int[]{i34}, new int[1], new int[]{i33}, strArr4};
        }
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MeteringPoint)) {
            int i38 = notify + 53;
            cancelAll = i38 % 128;
            if (i38 % 2 != 0) {
                int i39 = 72 / 0;
            }
            return false;
        }
        MeteringPoint meteringPoint = (MeteringPoint) p0;
        if (!Intrinsics.areEqual(this.a, meteringPoint.a)) {
            int i40 = notify + 63;
            cancelAll = i40 % 128;
            int i41 = i40 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.b, meteringPoint.b)) {
            int i42 = ((int[]) objArr2[1])[0];
            int i43 = i42 * i42;
            int i44 = -(1847197942 * i42);
            int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
            int i46 = -(i42 * (-1641425986));
            int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
            int i48 = (i47 ^ 2042406820) + ((2042406820 & i47) << 1);
            int i49 = i48 >> 24;
            int i50 = (((i49 & (-511)) + (i49 | (-511))) / 256) + 1;
            int i51 = (i48 ^ i50) + ((i50 & i48) << 1);
            int i52 = i48 >> 26;
            int i53 = ((i52 ^ ComposerKt.defaultsKey) + ((i52 & ComposerKt.defaultsKey) << 1)) / 64;
            int i54 = -(i51 ^ ((i53 & 1) + (i53 | 1)));
            int i55 = ((i54 | 3) << 1) - (i54 ^ 3);
            int i56 = i55 >> 22;
            int i57 = ((i56 & (-2047)) + (i56 | (-2047))) / 1024;
            int i58 = (i57 & 1) + (i57 | 1);
            return 0 / (((-(((i58 | 1) << 1) - (i58 ^ 1))) & i55) * 1618);
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, meteringPoint.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, meteringPoint.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            int i59 = notify + 37;
            cancelAll = i59 % 128;
            int i60 = i59 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, meteringPoint.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.g, meteringPoint.g)) {
            int i61 = cancelAll + 117;
            notify = i61 % 128;
            int i62 = i61 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, meteringPoint.TuitionPaymentFragmentbindingInflater1))) {
            return true;
        }
        int i63 = cancelAll + 113;
        notify = i63 % 128;
        int i64 = i63 % 2;
        return false;
    }

    static {
        cancel = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 83;
        cancel = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = notify + 63;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + this.g.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
        int i4 = notify + 49;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        getOffsetY<ViewEvent> getoffsety = this.a;
        getOffsetY<ErrorEvent> getoffsety2 = this.b;
        getOffsetY<ResourceEvent> getoffsety3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        getOffsetY<ActionEvent> getoffsety4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        getOffsetY<LongTaskEvent> getoffsety5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        getOffsetY<TelemetryConfigurationEvent> getoffsety6 = this.g;
        InternalLogger internalLogger = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder("MeteringPoint(a=");
        sb.append(getoffsety);
        sb.append(", b=");
        sb.append(getoffsety2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(getoffsety3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(getoffsety4);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(getoffsety5);
        sb.append(", g=");
        sb.append(getoffsety6);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(internalLogger);
        sb.append(")");
        String string = sb.toString();
        int i2 = notify + 67;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        asInterface = new char[]{60107, 60043, 60056, 60061, 60088, 60108, 60123, 60116, 60040, 60079, 60052, 60049, 60058, 60120, 60083, 60098, 60117, 60099, 60110, 60109, 60090, 60118, 60046, 60115, 60050, 60119, 60073, 60060, 60041, 60111, 60057, 60113, 60053, 60055, 60045, 60121, 60048, 60112, 60106, 60054, 60047, 60062, 60104, 60063, 60051, 60072, 60114, 60105, 60034};
        d = (char) 57190;
    }

    private static String $$g(byte b, byte b2, byte b3) {
        int i = 116 - b;
        int i2 = b2 + 4;
        int i3 = b3 * 3;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i3];
        int i4 = 0 - i3;
        int i5 = -1;
        if (bArr == null) {
            i = (-i) + i4;
            i2 = i2;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i2 + 1;
            i = (-bArr[i7]) + i;
            i2 = i7;
            i5 = i6;
        }
    }
}
