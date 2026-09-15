package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumErrorSource;
import com.datadog.android.rum.RumResourceKind;
import com.datadog.android.rum.RumResourceMethod;
import com.datadog.android.rum.internal.RumErrorSourceType;
import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.LongTaskEvent;
import com.datadog.android.rum.model.ResourceEvent;
import com.datadog.android.rum.model.ViewEvent;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class MirrorMode {

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;

        static {
            int[] iArr = new int[RumResourceMethod.values().length];
            try {
                iArr[RumResourceMethod.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RumResourceMethod.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RumResourceMethod.HEAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RumResourceMethod.PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RumResourceMethod.DELETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RumResourceMethod.PATCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RumResourceMethod.TRACE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RumResourceMethod.OPTIONS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RumResourceMethod.CONNECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RumResourceKind.values().length];
            try {
                iArr2[RumResourceKind.BEACON.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[RumResourceKind.FETCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[RumResourceKind.XHR.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[RumResourceKind.DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[RumResourceKind.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[RumResourceKind.JS.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[RumResourceKind.FONT.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[RumResourceKind.CSS.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[RumResourceKind.MEDIA.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[RumResourceKind.NATIVE.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[RumResourceKind.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[RumResourceKind.OTHER.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[RumErrorSource.values().length];
            try {
                iArr3[RumErrorSource.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[RumErrorSource.SOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[RumErrorSource.CONSOLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[RumErrorSource.LOGGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[RumErrorSource.AGENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[RumErrorSource.WEBVIEW.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[RumErrorSourceType.values().length];
            try {
                iArr4[RumErrorSourceType.ANDROID.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[RumErrorSourceType.BROWSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[RumErrorSourceType.REACT_NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[RumErrorSourceType.FLUTTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr4[RumErrorSourceType.NDK.ordinal()] = 5;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr4[RumErrorSourceType.NDK_IL2CPP.ordinal()] = 6;
            } catch (NoSuchFieldError unused33) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[RumActionType.values().length];
            try {
                iArr5[RumActionType.TAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr5[RumActionType.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr5[RumActionType.SWIPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr5[RumActionType.CLICK.ordinal()] = 4;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr5[RumActionType.BACK.ordinal()] = 5;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr5[RumActionType.CUSTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused39) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[NetworkInfo.Connectivity.values().length];
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_ETHERNET.ordinal()] = 1;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_WIMAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_2G.ordinal()] = 5;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_3G.ordinal()] = 6;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_4G.ordinal()] = 7;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_5G.ordinal()] = 8;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_MOBILE_OTHER.ordinal()] = 9;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_CELLULAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_OTHER.ordinal()] = 11;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED.ordinal()] = 12;
            } catch (NoSuchFieldError unused51) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[DeviceType.values().length];
            try {
                iArr7[DeviceType.MOBILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr7[DeviceType.TABLET.ordinal()] = 2;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr7[DeviceType.TV.ordinal()] = 3;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr7[DeviceType.DESKTOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused55) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[RumSessionScope.StartReason.values().length];
            try {
                iArr8[RumSessionScope.StartReason.USER_APP_LAUNCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr8[RumSessionScope.StartReason.INACTIVITY_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr8[RumSessionScope.StartReason.MAX_DURATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr8[RumSessionScope.StartReason.EXPLICIT_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr8[RumSessionScope.StartReason.BACKGROUND_LAUNCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr8[RumSessionScope.StartReason.PREWARM.ordinal()] = 6;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr8[RumSessionScope.StartReason.FROM_NON_INTERACTIVE_SESSION.ordinal()] = 7;
            } catch (NoSuchFieldError unused62) {
            }
            $EnumSwitchMapping$7 = iArr8;
        }
    }

    public static final ResourceEvent.OperationType TuitionPaymentFragmentspecialinlinedviewModeldefault2(final String str, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String upperCase = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            return ResourceEvent.OperationType.valueOf(upperCase);
        } catch (IllegalArgumentException e2) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$toOperationType$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str2 = str;
                    StringBuilder sb = new StringBuilder("Unable to convert [");
                    sb.append(str2);
                    sb.append("] to a valid graphql operation type");
                    return sb.toString();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e2, false, null);
            return null;
        }
    }

    public static final ErrorEvent.ErrorSource TuitionPaymentFragmentspecialinlinedviewModeldefault1(RumErrorSource rumErrorSource) {
        Intrinsics.checkNotNullParameter(rumErrorSource, "");
        switch (WhenMappings.$EnumSwitchMapping$2[rumErrorSource.ordinal()]) {
            case 1:
                return ErrorEvent.ErrorSource.NETWORK;
            case 2:
                return ErrorEvent.ErrorSource.SOURCE;
            case 3:
                return ErrorEvent.ErrorSource.CONSOLE;
            case 4:
                return ErrorEvent.ErrorSource.LOGGER;
            case 5:
                return ErrorEvent.ErrorSource.AGENT;
            case 6:
                return ErrorEvent.ErrorSource.WEBVIEW;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ErrorEvent.asInterface b(NetworkInfo networkInfo) {
        ErrorEvent.Status status;
        List listListOf;
        Intrinsics.checkNotNullParameter(networkInfo, "");
        Intrinsics.checkNotNullParameter(networkInfo, "");
        if (networkInfo.TuitionPaymentFragmentbindingInflater1 != NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED) {
            status = ErrorEvent.Status.CONNECTED;
        } else {
            status = ErrorEvent.Status.NOT_CONNECTED;
        }
        ErrorEvent.Status status2 = status;
        switch (WhenMappings.$EnumSwitchMapping$5[networkInfo.TuitionPaymentFragmentbindingInflater1.ordinal()]) {
            case 1:
                listListOf = CollectionsKt.listOf(ErrorEvent.Interface.ETHERNET);
                break;
            case 2:
                listListOf = CollectionsKt.listOf(ErrorEvent.Interface.WIFI);
                break;
            case 3:
                listListOf = CollectionsKt.listOf(ErrorEvent.Interface.WIMAX);
                break;
            case 4:
                listListOf = CollectionsKt.listOf(ErrorEvent.Interface.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                listListOf = CollectionsKt.listOf(ErrorEvent.Interface.CELLULAR);
                break;
            case 11:
                listListOf = CollectionsKt.listOf(ErrorEvent.Interface.OTHER);
                break;
            case 12:
                listListOf = CollectionsKt.emptyList();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new ErrorEvent.asInterface(status2, listListOf, null, (networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null && networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) ? null : new ErrorEvent.b(networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2, networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1), 4, null);
    }

    public static final ActionEvent.a TuitionPaymentFragmentbindingInflater1(NetworkInfo networkInfo) {
        ActionEvent.Status status;
        List listListOf;
        Intrinsics.checkNotNullParameter(networkInfo, "");
        Intrinsics.checkNotNullParameter(networkInfo, "");
        if (networkInfo.TuitionPaymentFragmentbindingInflater1 != NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED) {
            status = ActionEvent.Status.CONNECTED;
        } else {
            status = ActionEvent.Status.NOT_CONNECTED;
        }
        ActionEvent.Status status2 = status;
        switch (WhenMappings.$EnumSwitchMapping$5[networkInfo.TuitionPaymentFragmentbindingInflater1.ordinal()]) {
            case 1:
                listListOf = CollectionsKt.listOf(ActionEvent.Interface.ETHERNET);
                break;
            case 2:
                listListOf = CollectionsKt.listOf(ActionEvent.Interface.WIFI);
                break;
            case 3:
                listListOf = CollectionsKt.listOf(ActionEvent.Interface.WIMAX);
                break;
            case 4:
                listListOf = CollectionsKt.listOf(ActionEvent.Interface.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                listListOf = CollectionsKt.listOf(ActionEvent.Interface.CELLULAR);
                break;
            case 11:
                listListOf = CollectionsKt.listOf(ActionEvent.Interface.OTHER);
                break;
            case 12:
                listListOf = CollectionsKt.emptyList();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new ActionEvent.a(status2, listListOf, null, (networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null && networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) ? null : new ActionEvent.d(networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2, networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1), 4, null);
    }

    public static final ActionEvent.DeviceType TuitionPaymentFragmentspecialinlinedviewModeldefault2(DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(deviceType, "");
        int i = WhenMappings.$EnumSwitchMapping$6[deviceType.ordinal()];
        if (i == 1) {
            return ActionEvent.DeviceType.MOBILE;
        }
        if (i == 2) {
            return ActionEvent.DeviceType.TABLET;
        }
        if (i == 3) {
            return ActionEvent.DeviceType.TV;
        }
        if (i == 4) {
            return ActionEvent.DeviceType.DESKTOP;
        }
        return ActionEvent.DeviceType.OTHER;
    }

    public static final ErrorEvent.DeviceType TuitionPaymentFragmentbindingInflater1(DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(deviceType, "");
        int i = WhenMappings.$EnumSwitchMapping$6[deviceType.ordinal()];
        if (i == 1) {
            return ErrorEvent.DeviceType.MOBILE;
        }
        if (i == 2) {
            return ErrorEvent.DeviceType.TABLET;
        }
        if (i == 3) {
            return ErrorEvent.DeviceType.TV;
        }
        if (i == 4) {
            return ErrorEvent.DeviceType.DESKTOP;
        }
        return ErrorEvent.DeviceType.OTHER;
    }

    public static final ViewEvent.ViewEventSource TuitionPaymentFragmentbindingInflater1(ViewEvent.ViewEventSource.Companion companion, final String str, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(companion, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return ViewEvent.ViewEventSource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
        } catch (NoSuchElementException e2) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str2 = String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    return str2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e2, false, null);
            return null;
        }
    }

    public static final LongTaskEvent.LongTaskEventSource TuitionPaymentFragmentspecialinlinedviewModeldefault2(LongTaskEvent.LongTaskEventSource.Companion companion, final String str, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(companion, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return LongTaskEvent.LongTaskEventSource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        } catch (NoSuchElementException e2) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$2
                private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                private static final byte[] $$c = {42, -104, -68, 105};
                private static final int $$f = 158;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {83, -90, 68, -23, -44, -7, 2, -5, -12, -12, 5, -29, -6, -28, 36, -46, -13, -6, -3, -18, -2, -19, -16, 9, -29, 1, -16, -9, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
                private static final int $$e = 48;
                private static final byte[] $$a = {58, 66, -1, 15, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
                private static final int $$b = 199;
                private static int $asBinder = 0;
                private static int $asInterface = 1;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -469059049;
                private static int TuitionPaymentFragmentbindingInflater1 = -1934795591;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 86761820;
                private static byte[] b = {-10, 34, -13, 9, 4, -10, 33, -15, 88, 20, 21, -101, -14, -79, 40, 91, 88, 93, -20, 36, -19, 79, -93, 80, -33, -34, 75, -74, 125, 74, 73, -90, -38, 80, -94, 44, -91, 53, -38, 30, 17, -1, -35, 41, -95, -26, -23, -53, 1, -81, -13, -25, -52, Base64.padSymbol, -25, -62, -5, 33, -9, -19, -25, -10, -21, -13, 29, -26, -26, -26, -26};

                private static void a(byte b2, short s, int i, Object[] objArr) {
                    int i2 = (s * 3) + 97;
                    int i3 = 14 - (b2 * 10);
                    byte[] bArr = $$a;
                    byte[] bArr2 = new byte[i + 1];
                    int i4 = -1;
                    if (bArr == null) {
                        i3++;
                        i2 = (i3 + i) - 5;
                    }
                    while (true) {
                        i4++;
                        bArr2[i4] = (byte) i2;
                        if (i4 == i) {
                            objArr[0] = new String(bArr2, 0);
                            return;
                        } else {
                            byte b3 = bArr[i3];
                            i3++;
                            i2 = (i2 + b3) - 5;
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0026  */
                /* JADX WARN: Code duplicated, block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void d(short r6, short r7, int r8, java.lang.Object[] r9) {
                    /*
                        int r7 = r7 * 13
                        int r0 = 38 - r7
                        int r6 = r6 * 24
                        int r6 = 27 - r6
                        byte[] r1 = com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$2.$$d
                        int r8 = 84 - r8
                        byte[] r0 = new byte[r0]
                        int r7 = 37 - r7
                        r2 = 0
                        if (r1 != 0) goto L16
                        r3 = r7
                        r4 = r2
                        goto L2e
                    L16:
                        r3 = r2
                    L17:
                        int r6 = r6 + 1
                        byte r4 = (byte) r8
                        r0[r3] = r4
                        if (r3 != r7) goto L26
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r0, r2)
                        r9[r2] = r6
                        return
                    L26:
                        int r3 = r3 + 1
                        r4 = r1[r6]
                        r5 = r3
                        r3 = r8
                        r8 = r4
                        r4 = r5
                    L2e:
                        int r8 = -r8
                        int r3 = r3 + r8
                        int r8 = r3 + (-10)
                        r3 = r4
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$2.d(short, short, int, java.lang.Object[]):void");
                }

                private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
                    long j;
                    byte b3;
                    long j2;
                    int i4;
                    boolean z;
                    int i5 = 2 % 2;
                    SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                    StringBuilder sb = new StringBuilder();
                    try {
                        Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2266 - MotionEvent.axisFromString(""), ImageFormat.getBitsPerPixel(0) + 34, 1387473586, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        boolean z2 = iIntValue == -1;
                        if (!z2) {
                            j = 3046761265686732006L;
                        } else {
                            byte[] bArr = b;
                            float f = 0.0f;
                            if (bArr != null) {
                                int length = bArr.length;
                                byte[] bArr2 = new byte[length];
                                int i6 = 0;
                                while (i6 < length) {
                                    Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 3358;
                                        int i7 = (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 18;
                                        byte b6 = (byte) 0;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetAfter, iMakeMeasureSpec, i7, -1054011043, false, $$g(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                    i6++;
                                    f = 0.0f;
                                }
                                bArr = bArr2;
                            }
                            if (bArr != null) {
                                int i8 = $10 + 73;
                                $11 = i8 % 128;
                                if (i8 % 2 == 0) {
                                    byte[] bArr3 = b;
                                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        byte b7 = (byte) 0;
                                        byte b8 = b7;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2267 - View.resolveSize(0, 0), 34 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1387473586, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    b3 = (byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) & 3046761265686732006L);
                                    j2 = ((long) TuitionPaymentFragmentbindingInflater1) - 3046761265686732006L;
                                } else {
                                    byte[] bArr4 = b;
                                    Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        byte b9 = (byte) 0;
                                        byte b10 = b9;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 2267 - Color.blue(0), 32 - TextUtils.indexOf((CharSequence) "", '0'), 1387473586, false, $$g(b9, b10, b10), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    b3 = (byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L);
                                    j2 = ((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L;
                                }
                                iIntValue = (byte) (b3 + ((int) j2));
                                j = 3046761265686732006L;
                            } else {
                                j = 3046761265686732006L;
                                iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                            }
                        }
                        if (iIntValue > 0) {
                            int i9 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ j));
                            if (z2) {
                                int i10 = $11 + 45;
                                $10 = i10 % 128;
                                int i11 = i10 % 2;
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i9 + i4;
                            Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b11 = (byte) 0;
                                byte b12 = b11;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 55905), 2855 - Color.blue(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 14, -1529949196, false, $$g(b11, b12, (byte) (b12 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                            }
                            ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            byte[] bArr5 = b;
                            if (bArr5 != null) {
                                int i12 = $10 + 13;
                                $11 = i12 % 128;
                                int i13 = i12 % 2;
                                int length2 = bArr5.length;
                                byte[] bArr6 = new byte[length2];
                                for (int i14 = 0; i14 < length2; i14++) {
                                    bArr6[i14] = (byte) (((long) bArr5[i14]) ^ 3046761265686732006L);
                                }
                                bArr5 = bArr6;
                            }
                            if (bArr5 != null) {
                                int i15 = $10 + 117;
                                int i16 = i15 % 128;
                                $11 = i16;
                                z = i15 % 2 != 0;
                                int i17 = i16 + 61;
                                $10 = i17 % 128;
                                if (i17 % 2 != 0) {
                                    int i18 = 5 / 3;
                                }
                            } else {
                                z = false;
                            }
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                            while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                                if (z) {
                                    byte[] bArr7 = b;
                                    int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                                } else {
                                    short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                                }
                                sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                            }
                        }
                        objArr[0] = sb.toString();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ String invoke() throws Throwable {
                    Object[] objArr;
                    int i = 2 % 2;
                    int i2 = $asInterface + 5;
                    $asBinder = i2 % 128;
                    int i3 = i2 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    int i4 = 0;
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 876;
                        int packedPositionType = 10 - ExpandableListView.getPackedPositionType(0L);
                        byte[] bArr = $$a;
                        Object[] objArr2 = new Object[1];
                        a((byte) (-bArr[2]), bArr[11], bArr[17], objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, touchSlop, packedPositionType, -1199417970, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr3 = new Object[1];
                    c(1987658407 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-73) - Color.argb(0, 0, 0, 0), (short) (TextUtils.getTrimmedLength("") - 105), (byte) ((-80) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (-1755834097) - TextUtils.getOffsetBefore("", 0), objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    c(1987658411 - View.resolveSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 79, (short) ('9' - AndroidCharacter.getMirror('0')), (byte) (TextUtils.indexOf((CharSequence) "", '0') + 75), Color.green(0) - 1755834076, objArr4);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cBlue = (char) Color.blue(0);
                        int defaultSize = 876 - View.getDefaultSize(0, 0);
                        int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte[] bArr2 = $$a;
                        byte b2 = bArr2[11];
                        Object[] objArr5 = new Object[1];
                        a(b2, (byte) (-bArr2[2]), b2, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, defaultSize, keyRepeatTimeout, 254769921, false, (String) objArr5[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        int i5 = $asInterface + 103;
                        $asBinder = i5 % 128;
                        int i6 = i5 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
                            int iNormalizeMetaState = 10 - KeyEvent.normalizeMetaState(0);
                            byte[] bArr3 = $$a;
                            byte b3 = bArr3[11];
                            byte b4 = bArr3[12];
                            Object[] objArr6 = new Object[1];
                            a(b3, b3, b4, objArr6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, edgeSlop, iNormalizeMetaState, 1324201839, false, (String) objArr6[0], null);
                        }
                        Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i7 = ~iIdentityHashCode;
                        int i8 = (((((~(242969559 | i7)) | (~((-68161) | iIdentityHashCode))) * 988) - 1730417816) + ((((~(iIdentityHashCode | 202591170)) | 40378389) | (~(i7 | (-68161)))) * 988)) - 130919188;
                        int i9 = (i8 << 13) ^ i8;
                        int i10 = i9 ^ (i9 >>> 17);
                        ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
                    } else {
                        Object[] objArr8 = new Object[1];
                        c(1987658415 - ExpandableListView.getPackedPositionChild(0L), (-79) - TextUtils.indexOf("", "", 0, 0), (short) ((-10) - Gravity.getAbsoluteGravity(0, 0)), (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 56), TextUtils.getOffsetAfter("", 0) - 1755834062, objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        c(1987658415 - View.resolveSize(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 79, (short) (120 - ImageFormat.getBitsPerPixel(0)), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 112), (-1755834047) - KeyEvent.getDeadChar(0, 0), objArr9);
                        int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                        int i11 = $asInterface + 71;
                        $asBinder = i11 % 128;
                        int i12 = i11 % 2;
                        try {
                            Object[] objArr10 = {Integer.valueOf(iIntValue), -130919188};
                            byte[] bArr4 = $$d;
                            byte b5 = bArr4[25];
                            byte b6 = b5;
                            Object[] objArr11 = new Object[1];
                            d(b5, b6, b6, objArr11);
                            Class<?> cls3 = Class.forName((String) objArr11[0]);
                            byte b7 = bArr4[52];
                            byte b8 = b7;
                            Object[] objArr12 = new Object[1];
                            d(b7, b8, b8, objArr12);
                            objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                                int i13 = 876 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 10;
                                byte[] bArr5 = $$a;
                                byte b9 = bArr5[11];
                                Object[] objArr13 = new Object[1];
                                a(b9, b9, bArr5[12], objArr13);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, i13, scrollBarSize, 1324201839, false, (String) objArr13[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr14 = new Object[1];
                                c(1987658406 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 74, (short) (ImageFormat.getBitsPerPixel(0) - 104), (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 81), (-1755834097) - TextUtils.getOffsetBefore("", 0), objArr14);
                                Class<?> cls4 = Class.forName((String) objArr14[0]);
                                Object[] objArr15 = new Object[1];
                                c(View.getDefaultSize(0, 0) + 1987658411, ((Process.getThreadPriority(0) + 20) >> 6) - 80, (short) (9 - TextUtils.indexOf("", "", 0)), (byte) (View.resolveSizeAndState(0, 0, 0) + 74), View.MeasureSpec.getSize(0) - 1755834076, objArr15);
                                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                                    int iMyPid = 876 - (Process.myPid() >> 22);
                                    int i14 = 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    byte[] bArr6 = $$a;
                                    byte b10 = bArr6[11];
                                    Object[] objArr16 = new Object[1];
                                    a(b10, (byte) (-bArr6[2]), b10, objArr16);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, iMyPid, i14, 254769921, false, (String) objArr16[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char cIndexOf3 = (char) TextUtils.indexOf("", "");
                                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 876;
                                    int iGreen = Color.green(0) + 10;
                                    byte[] bArr7 = $$a;
                                    Object[] objArr17 = new Object[1];
                                    a((byte) (-bArr7[2]), bArr7[11], bArr7[17], objArr17);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf3, touchSlop2, iGreen, -1199417970, false, (String) objArr17[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                int i15 = $asInterface + 51;
                                $asBinder = i15 % 128;
                                int i16 = i15 % 2;
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr[3];
                        if (strArr == null) {
                            throw null;
                        }
                        int i17 = $asInterface + 93;
                        $asBinder = i17 % 128;
                        if (i17 % 2 != 0) {
                            int i18 = 5 % 4;
                        }
                        while (i4 < strArr.length) {
                            int i19 = $asBinder + 105;
                            $asInterface = i19 % 128;
                            if (i19 % 2 == 0) {
                                arrayList.add(strArr[i4]);
                                i4 += 44;
                            } else {
                                arrayList.add(strArr[i4]);
                                i4++;
                            }
                        }
                        throw null;
                    }
                    int i20 = $asInterface + 1;
                    $asBinder = i20 % 128;
                    int i21 = i20 % 2;
                    int i22 = ((int[]) objArr[1])[0];
                    Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int i23 = ~((int) SystemClock.uptimeMillis());
                    int i24 = i22 + (-1918176544) + (((-4254249) | i23) * 494) + (((~(i23 | (-107801130))) | 247403991) * 494);
                    int i25 = (i24 << 13) ^ i24;
                    int i26 = i25 ^ (i25 >>> 17);
                    ((int[]) objArr18[1])[0] = i26 ^ (i26 << 5);
                    int i27 = $asBinder + 19;
                    $asInterface = i27 % 128;
                    int i28 = i27 % 2;
                    return TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }

                public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                    int i = 2 % 2;
                    int i2 = $asInterface + 123;
                    $asBinder = i2 % 128;
                    int i3 = i2 % 2;
                    String str2 = String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    int i4 = $asInterface + 61;
                    $asBinder = i4 % 128;
                    if (i4 % 2 == 0) {
                        return str2;
                    }
                    throw null;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0022  */
                /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static java.lang.String $$g(int r6, short r7, byte r8) {
                    /*
                        byte[] r0 = com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$2.$$c
                        int r7 = r7 * 3
                        int r7 = 1 - r7
                        int r8 = r8 + 117
                        int r6 = r6 * 3
                        int r6 = 4 - r6
                        byte[] r1 = new byte[r7]
                        r2 = 0
                        if (r0 != 0) goto L14
                        r3 = r7
                        r4 = r2
                        goto L28
                    L14:
                        r3 = r2
                    L15:
                        byte r4 = (byte) r8
                        r1[r3] = r4
                        int r3 = r3 + 1
                        if (r3 != r7) goto L22
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        return r6
                    L22:
                        r4 = r0[r6]
                        r5 = r3
                        r3 = r8
                        r8 = r4
                        r4 = r5
                    L28:
                        int r8 = -r8
                        int r6 = r6 + 1
                        int r8 = r8 + r3
                        r3 = r4
                        goto L15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$2.$$g(int, short, byte):java.lang.String");
                }
            }, e2, false, null);
            return null;
        }
    }

    public static final ErrorEvent.ErrorEventSource TuitionPaymentFragmentbindingInflater1(ErrorEvent.ErrorEventSource.Companion companion, final String str, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(companion, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return ErrorEvent.ErrorEventSource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        } catch (NoSuchElementException e2) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str2 = String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    return str2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e2, false, null);
            return null;
        }
    }

    public static final ActionEvent.ActionEventSource TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActionEvent.ActionEventSource.Companion companion, final String str, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(companion, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return ActionEvent.ActionEventSource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        } catch (NoSuchElementException e2) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$4
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str2 = String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    return str2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e2, false, null);
            return null;
        }
    }

    public static final ResourceEvent.ResourceEventSource b(ResourceEvent.ResourceEventSource.Companion companion, final String str, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(companion, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return ResourceEvent.ResourceEventSource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        } catch (NoSuchElementException e2) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$5
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str2 = String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    return str2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e2, false, null);
            return null;
        }
    }

    public static final ActionEvent.SessionPrecondition TuitionPaymentFragmentspecialinlinedviewModeldefault2(RumSessionScope.StartReason startReason) {
        Intrinsics.checkNotNullParameter(startReason, "");
        switch (WhenMappings.$EnumSwitchMapping$7[startReason.ordinal()]) {
            case 1:
                return ActionEvent.SessionPrecondition.USER_APP_LAUNCH;
            case 2:
                return ActionEvent.SessionPrecondition.INACTIVITY_TIMEOUT;
            case 3:
                return ActionEvent.SessionPrecondition.MAX_DURATION;
            case 4:
                return ActionEvent.SessionPrecondition.EXPLICIT_STOP;
            case 5:
                return ActionEvent.SessionPrecondition.BACKGROUND_LAUNCH;
            case 6:
                return ActionEvent.SessionPrecondition.PREWARM;
            case 7:
                return ActionEvent.SessionPrecondition.FROM_NON_INTERACTIVE_SESSION;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ErrorEvent.SessionPrecondition b(RumSessionScope.StartReason startReason) {
        Intrinsics.checkNotNullParameter(startReason, "");
        switch (WhenMappings.$EnumSwitchMapping$7[startReason.ordinal()]) {
            case 1:
                return ErrorEvent.SessionPrecondition.USER_APP_LAUNCH;
            case 2:
                return ErrorEvent.SessionPrecondition.INACTIVITY_TIMEOUT;
            case 3:
                return ErrorEvent.SessionPrecondition.MAX_DURATION;
            case 4:
                return ErrorEvent.SessionPrecondition.EXPLICIT_STOP;
            case 5:
                return ErrorEvent.SessionPrecondition.BACKGROUND_LAUNCH;
            case 6:
                return ErrorEvent.SessionPrecondition.PREWARM;
            case 7:
                return ErrorEvent.SessionPrecondition.FROM_NON_INTERACTIVE_SESSION;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
