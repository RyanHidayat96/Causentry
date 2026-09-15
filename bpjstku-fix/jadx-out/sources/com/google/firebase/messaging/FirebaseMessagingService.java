package com.google.firebase.messaging;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.zzu;
import com.google.android.material.timepicker.ClockHandView$$ExternalSyntheticLambda0;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import kotlin.io.encoding.Base64;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static short[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static byte[] b;
    private static int g;
    private static final Queue<String> recentlyReceivedMessageIds;
    private Rpc rpc;
    private static final byte[] $$q = {29, -5, -24, -13};
    private static final int $$r = 216;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {65, -122, -65, 2, 0, -17, 48, -33, -20, 12, 45, 0, -33, -24, 0, -9, 11, -21, -3, 1, 11, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 63, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -53, -15, 8, -16, 1, 4, 3, 52, -59, -8, -8, 67, -61, -7, -8, 13, -15, 2, 11, -13, 60, -53, -22, -1, 10, 56, -78, -2, 17, -12, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 64, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -53, -15, 8, -16, 1, 4, 3, 52, -64, 1, 5, -18, 15, -19, 7, 2, -16, 67, -68, 2, 9, -4, -4, -16, 67, -61, -7, -8, 13, -15, 2, 11, -13, 60, -78, -2, 22, -26, 16, -6, -7, 6, 1, -7, 62, -71, 12, -14, -6, 14, -11, 9, -4, -16, 67, -39, -20, -14, -6, 14, -11, 9, -4, -16, 38, -43, 19, -2, -2, 10, -20, -14, -6, 14, -11, 9, -4, -16, 38, -43, 78, -75, 2, -7, -9, 0, 77, -15, 11, -2, -35, -53, 2, 13, -15, 2, 11, -13, 23, -40, 9, -8, 10, 1, -17, 9, 4, 21, -23, -14, 9, -4, 1, 47, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -58, -5, -11, 11, 1, -1, -20, 12, 53, -71, 12, -16, -2, 8, -8, -1, -7, 67, -39, -23, 5, -19, 11, -1, 15, -20, -16, -2, 8, -8, -1, 26, -21, -13, -1, -6, 8, -13, 3, -5, -9, 46, -38, -5, 2, 70, -76, -3, -7, 9, 1, -21, 36, -36, 17, -19, 14, -17, 7, 5, -5, -15, -3, 77, -15, -32, -14, 6, -15, 15, 22, -29, 13, -33, 9, -5, 12, -17, 46, -39, -12, 1, 2, 9, -26, 42, -36, 9, -3};
    private static final int $$n = 167;
    private static final byte[] $$g = {81, -102, -70, -91, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
    private static final int $$h = 80;
    private static int asInterface = 0;
    private static int asBinder = 1;
    private static int d = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void i(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r0 = r8 + 1
            int r7 = 103 - r7
            byte[] r1 = com.google.firebase.messaging.FirebaseMessagingService.$$g
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r3 = r7
            r4 = r2
            r7 = r6
            goto L29
        L11:
            r3 = r2
        L12:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L29:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.i(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void k(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.firebase.messaging.FirebaseMessagingService.$$m
            int r6 = 375 - r6
            int r1 = 76 - r7
            int r8 = 115 - r8
            byte[] r1 = new byte[r1]
            int r7 = 75 - r7
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2b:
            int r6 = r6 + 1
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-2)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.k(short, byte, int, java.lang.Object[]):void");
    }

    static {
        g = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        recentlyReceivedMessageIds = new ArrayDeque(10);
        int i = d + 103;
        g = i % 128;
        int i2 = i % 2;
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    protected Intent getStartCommandIntent(Intent intent) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            ServiceStarter.getInstance().getMessagingEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intent messagingEvent = ServiceStarter.getInstance().getMessagingEvent();
        int i3 = asInterface + 97;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return messagingEvent;
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent) {
        int i = 2 % 2;
        String action = intent.getAction();
        if (!ACTION_REMOTE_INTENT.equals(action)) {
            int i2 = asInterface + 75;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action);
                throw null;
            }
            if (!ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
                if (ACTION_NEW_TOKEN.equals(action)) {
                    int i3 = asInterface + 113;
                    asBinder = i3 % 128;
                    int i4 = i3 % 2;
                    onNewToken(intent.getStringExtra(EXTRA_TOKEN));
                    return;
                }
                intent.getAction();
                int i5 = asInterface + 13;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
        }
        handleMessageIntent(intent);
    }

    private void handleMessageIntent(Intent intent) {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (!alreadyReceivedMessage(intent.getStringExtra(Constants.MessagePayloadKeys.MSGID))) {
            int i4 = asBinder + 79;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                passMessageIntentToSdk(intent);
            } else {
                passMessageIntentToSdk(intent);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        getRpc(this).messageHandled(new CloudMessage(intent));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    private void passMessageIntentToSdk(Intent intent) {
        String stringExtra;
        int i = 2 % 2;
        int i2 = asBinder + 53;
        asInterface = i2 % 128;
        byte b2 = 0;
        if (i2 % 2 != 0) {
            stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MESSAGE_TYPE);
            int i3 = 9 / 0;
            if (stringExtra == null) {
                int i4 = asInterface + 23;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                stringExtra = Constants.MessageTypes.MESSAGE;
            }
        } else {
            stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MESSAGE_TYPE);
            if (stringExtra == null) {
                int i6 = asInterface + 23;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                stringExtra = Constants.MessageTypes.MESSAGE;
            }
        }
        stringExtra.hashCode();
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (!stringExtra.equals(Constants.MessageTypes.DELETED)) {
                    b2 = -1;
                }
                break;
            case 102161:
                if (!(!stringExtra.equals(Constants.MessageTypes.MESSAGE))) {
                    int i8 = asInterface + 119;
                    asBinder = i8 % 128;
                    int i9 = i8 % 2;
                    b2 = 1;
                } else {
                    b2 = -1;
                }
                break;
            case 814694033:
                if (!stringExtra.equals(Constants.MessageTypes.SEND_ERROR)) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 814800675:
                if (!(!stringExtra.equals(Constants.MessageTypes.SEND_EVENT))) {
                    int i10 = asInterface + 63;
                    asBinder = i10 % 128;
                    int i11 = i10 % 2;
                    b2 = 3;
                } else {
                    b2 = -1;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            onDeletedMessages();
            return;
        }
        if (b2 == 1) {
            MessagingAnalytics.logNotificationReceived(intent);
            dispatchMessage(intent);
        } else if (b2 == 2) {
            onSendError(getMessageId(intent), new SendException(intent.getStringExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR)));
        } else {
            if (b2 != 3) {
                return;
            }
            onMessageSent(intent.getStringExtra(Constants.MessagePayloadKeys.MSGID));
        }
    }

    private static void j(int i, int i2, short s, int i3, byte b2, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        boolean z;
        int i6 = 2;
        int i7 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getPressedStateDuration() >> 16) + 2267, Drawable.resolveOpacity(0, 0) + 33, 1387473586, false, $$s(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                int i8 = $10 + 35;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
                byte[] bArr = b;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $11 + 121;
                        $10 = i10 % 128;
                        if (i10 % i6 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                int iBlue = Color.blue(0) + 3358;
                                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 18;
                                byte length2 = (byte) $$q.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, iBlue, threadPriority, -1054011043, false, $$s((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cMyTid = (char) (Process.myTid() >> 22);
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 3359;
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 19;
                                byte length3 = (byte) $$q.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, iLastIndexOf, iIndexOf, -1054011043, false, $$s((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                        }
                        i9++;
                        i6 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = b;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) KeyEvent.keyCodeFromString(""), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2267, KeyEvent.getDeadChar(0, 0) + 33, 1387473586, false, $$s(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentbindingInflater1[i + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i11 = ((i + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L));
                if (!z2) {
                    i4 = 0;
                } else {
                    int i12 = $10 + 97;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 1;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i11 + i4;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 55904), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2854, (ViewConfiguration.getTapTimeout() >> 16) + 13, -1529949196, false, $$s(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = b;
                if (bArr4 != null) {
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    int i14 = 0;
                    while (i14 < length4) {
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 3046761265686732006L);
                        i14++;
                        int i15 = $11 + 69;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                    }
                    i5 = 2;
                    bArr4 = bArr5;
                } else {
                    i5 = 2;
                }
                if (bArr4 != null) {
                    int i17 = $10 + 19;
                    $11 = i17 % 128;
                    int i18 = i17 % i5;
                    z = true;
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i19 = $10;
                    int i20 = i19 + 105;
                    $11 = i20 % 128;
                    int i21 = i20 % 2;
                    if (z) {
                        int i22 = i19 + 95;
                        $11 = i22 % 128;
                        int i23 = i22 % 2;
                        byte[] bArr6 = b;
                        int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i24]) ^ 3046761265686732006L)) + s)) ^ b2));
                        int i25 = $10 + 77;
                        $11 = i25 % 128;
                        int i26 = i25 % 2;
                    } else {
                        short[] sArr = TuitionPaymentFragmentbindingInflater1;
                        int i27 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i27 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i27]) ^ 3046761265686732006L)) + s)) ^ b2));
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

    private void dispatchMessage(Intent intent) {
        int i = 2 % 2;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (NotificationParams.isNotification(extras)) {
            NotificationParams notificationParams = new NotificationParams(extras);
            ExecutorService executorServiceNewNetworkIOExecutor = FcmExecutors.newNetworkIOExecutor();
            try {
                if (new DisplayNotification(this, notificationParams, executorServiceNewNetworkIOExecutor).handleNotification()) {
                    executorServiceNewNetworkIOExecutor.shutdown();
                    return;
                }
                executorServiceNewNetworkIOExecutor.shutdown();
                if (MessagingAnalytics.shouldUploadScionMetrics(intent)) {
                    int i2 = asBinder + 19;
                    asInterface = i2 % 128;
                    int i3 = i2 % 2;
                    MessagingAnalytics.logNotificationForeground(intent);
                    int i4 = asInterface + 51;
                    asBinder = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 2 / 3;
                    }
                }
            } catch (Throwable th) {
                executorServiceNewNetworkIOExecutor.shutdown();
                throw th;
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    private boolean alreadyReceivedMessage(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str)) {
            int i4 = asBinder + 69;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            int i6 = asBinder + 37;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        int i7 = asBinder + 5;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    private String getMessageId(Intent intent) {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID);
        if (stringExtra == null) {
            return intent.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER);
        }
        int i4 = asInterface + 41;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    private Rpc getRpc(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this.rpc == null) {
            this.rpc = new Rpc(context.getApplicationContext());
            int i4 = asBinder + 21;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        return this.rpc;
    }

    static void resetForTesting() {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        recentlyReceivedMessageIds.clear();
        int i4 = asInterface + 87;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    void setRpcForTesting(Rpc rpc) {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.rpc = rpc;
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int i3 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 15;
            byte[] bArr = $$g;
            Object[] objArr2 = new Object[1];
            i(bArr[132], bArr[10], (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i3, offsetBefore, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 162510685, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 960543284, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 93, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 106), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        j((-162510626) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 960543299, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_review_screen_cta_text_try_later).substring(0, 20).length() - 20), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 93, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.error_message_status_code_400).substring(21, 22).codePointAt(0) - 32), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int i4 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int iGreen = 15 - Color.green(0);
            Object[] objArr5 = new Object[1];
            i((short) 51, $$g[10], (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, i4, iGreen, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = asBinder + 37;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int defaultSize = View.getDefaultSize(0, 0) + 1031;
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
                short s = (short) 103;
                Object[] objArr6 = new Object[1];
                i(s, (byte) (s & 29), $$g[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, defaultSize, maximumFlingVelocity, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr7[3])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i10 = ((((-1410750159) + ((311473518 | i9) * 376)) + (((~((~i9) | 831920877)) | 33596674) * (-376))) + (((~(i9 | (-831920878))) | (-587640708)) * 376)) - 412993068;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_network_not_available).substring(0, 23).length() - 162510635, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 960543188, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.payment_method_shopeepay_deeplink).substring(0, 9).length() - 66, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.instruction_alto7).substring(16, 17).codePointAt(0) - 101), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 162510632, 960543304 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (short) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 57, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1548911309};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 46038), 1134 - View.resolveSize(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -412993068, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iResolveSize = View.resolveSize(0, 0) + 1031;
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 15;
                    byte[] bArr2 = $$g;
                    Object[] objArr12 = new Object[1];
                    i(bArr2[132], bArr2[10], (byte) 52, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iResolveSize, iKeyCodeFromString, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getLongPressTimeout() >> 16) + 1117, 16 - TextUtils.lastIndexOf("", '0')), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int iKeyCodeFromString2 = 1031 - KeyEvent.keyCodeFromString("");
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 16;
                    short s2 = (short) 103;
                    Object[] objArr13 = new Object[1];
                    i(s2, (byte) (s2 & 29), $$g[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, iKeyCodeFromString2, iIndexOf, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 162510660, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_validate_in_progress).substring(0, 22).codePointAt(13) + 960543263, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.contentFilteringHtmlDetailCellCategoryTitle).substring(0, 8).codePointAt(1) - 65), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_unknown_error_processing_validate).substring(0, 64).codePointAt(56) - 156, (byte) Color.green(0), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.uikit_uob_app_instruction_2).substring(5, 6).codePointAt(0) - 162510659, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.shipping_cb_message).substring(0, 3).codePointAt(2) + 960543190, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), (-57) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) TextUtils.getOffsetBefore("", 0), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1031;
                        int iIndexOf2 = TextUtils.indexOf("", "") + 15;
                        Object[] objArr16 = new Object[1];
                        i((short) 51, $$g[10], (byte) 52, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, maximumDrawingCacheSize, iIndexOf2, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c3 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int i13 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1031;
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
                        byte[] bArr3 = $$g;
                        Object[] objArr17 = new Object[1];
                        i(bArr3[132], bArr3[10], (byte) 52, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, i13, scrollDefaultDelay, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                int i16 = asBinder + 17;
                asInterface = i16 % 128;
                for (int i17 = i16 % 2 == 0 ? 0 : 1; i17 < strArr2.length; i17++) {
                    int i18 = asInterface + 11;
                    asBinder = i18 % 128;
                    int i19 = i18 % 2;
                    arrayList.add(strArr2[i17]);
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i20 = ((int[]) objArr[2])[0];
        int i21 = ((int[]) objArr[3])[0];
        int i22 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i23 = i20 + (-1410750159) + (((-208423530) | elapsedCpuTime) * 376) + (((~((~elapsedCpuTime) | 152687272)) | (-226351850)) * (-376)) + (((~(elapsedCpuTime | (-152687273))) | 91592897) * 376);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr18[2])[0] = i25 ^ (i25 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cRed = (char) (Color.red(0) + 29944);
            int iAxisFromString = MotionEvent.axisFromString("") + 1756;
            int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
            byte[] bArr4 = $$g;
            Object[] objArr19 = new Object[1];
            i((short) 103, bArr4[10], (byte) (bArr4[208] - 1), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cRed, iAxisFromString, deadChar, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
                int keyRepeatDelay = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 23;
                Object[] objArr20 = new Object[1];
                i((short) 51, $$g[10], (byte) 52, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(threadPriority, keyRepeatDelay, absoluteGravity, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i26 = ((969354778 + (((~((-550246021) | (~iIdentityHashCode))) | 337643594) * (-591))) + ((iIdentityHashCode | (-550246021)) * 591)) - 1585626104;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 162510729, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_liveliness_object_active).substring(3, 4).codePointAt(0) + 960543203, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.hint_mandiri_debit_card_no).substring(22, 23).length() - 1), (-57) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bni_mobile_instruction_4).substring(5, 12).codePointAt(5) - 116), objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 162510703, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_unknown_error_while_decrypting_response).substring(0, 39).length() + 960543264, (short) ((-1) - ExpandableListView.getPackedPositionChild(0L)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 68, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {1548911309};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42048 - ExpandableListView.getPackedPositionChild(0L)), View.getDefaultSize(0, 0) + 1726, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = ClockHandView$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), -1585626104, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29945);
                int iResolveSize2 = 1755 - View.resolveSize(0, 0);
                int iMyPid = 23 - (Process.myPid() >> 22);
                Object[] objArr25 = new Object[1];
                i((short) 51, $$g[10], (byte) 52, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf2, iResolveSize2, iMyPid, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr26 = new Object[1];
                j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.uikit_uob_web_instruction_1).substring(1, 3).codePointAt(1) - 162510754, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 960543284, (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 68, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 98), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 162510663, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 960543192, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.payment_method_gopay_qris).substring(0, 6).codePointAt(2) - 80), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 166, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.saved_card).substring(7, 9).length() - 2), objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 29945);
                    int iMyTid = (Process.myTid() >> 22) + 1755;
                    int i29 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22;
                    Object[] objArr28 = new Object[1];
                    i((short) 140, $$g[10], (byte) 52, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cLastIndexOf, iMyTid, i29, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                    int i30 = 1756 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i31 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte[] bArr5 = $$g;
                    Object[] objArr29 = new Object[1];
                    i((short) 103, bArr5[10], (byte) (bArr5[208] - 1), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(jumpTapTimeout, i30, i31, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr4 == null) {
                throw null;
            }
            while (i2 < strArr4.length) {
                int i32 = asBinder + 41;
                asInterface = i32 % 128;
                if (i32 % 2 != 0) {
                    arrayList2.add(strArr4[i2]);
                    i2 += 70;
                } else {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i33 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i34 = ~iFreeMemory;
        int i35 = i33 + 1289857641 + ((iFreeMemory | (-177124121)) * 140) + (((~((-177124121) | i34)) | 34242832) * (-280)) + (((~(iFreeMemory | (-34242833))) | (~(389726546 | i34)) | (-532607835)) * 140);
        int i36 = (i35 << 13) ^ i35;
        int i37 = i36 ^ (i36 >>> 17);
        ((int[]) objArr30[3])[0] = i37 ^ (i37 << 5);
        int i38 = asInterface + 123;
        asBinder = i38 % 128;
        if (i38 % 2 == 0) {
            int i39 = 87 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:205:0x16d1  */
    /* JADX WARN: Code duplicated, block: B:58:0x099c  */
    /* JADX WARN: Code duplicated, block: B:61:0x09a6  */
    @Override // com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public void onCreate() throws Throwable {
        Object[] objArr;
        int i;
        String str;
        Object[] objArr2;
        String str2;
        String str3;
        String str4;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        int i2;
        Object[] objArr8;
        String str5;
        Object[] objArr9;
        char c;
        Object[] objArr10;
        Object[] objArr11;
        int i3 = 2 % 2;
        String str6 = "android.app.ActivityThread";
        String str7 = "currentApplication";
        Object[] objArr12 = new Object[1];
        j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 162510685, 960543195 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.status_message_userid_invalid).substring(13, 15).codePointAt(1), (short) (Process.getGidForName("") + 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.uikit_uob_app_instruction_4).substring(1, 2).codePointAt(0) - 158, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 116), objArr12);
        String str8 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        j((-162510628) - ImageFormat.getBitsPerPixel(0), 960543298 - TextUtils.indexOf((CharSequence) "", '0'), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.payment_method_description_xl_tunai).substring(1, 3).codePointAt(1) - 121), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 58, (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr13);
        String str9 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.message_invalid_merchant_url).substring(0, 13).length() - 162510625, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 960543268, (short) TextUtils.getCapsMode("", 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.validation_billingcountry_empty).substring(10, 11).codePointAt(0) - 158, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), objArr14);
        String str10 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        j((-162510596) - (ViewConfiguration.getScrollDefaultDelay() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 960543292, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_tutorial_dialog_screen_warning_text_mask).substring(11, 12).length() - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.validation_full_name_empty).substring(19, 20).codePointAt(0) - 154, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 98), objArr15);
        String str11 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bri_atm_instruction_1).substring(30, 31).length() - 162510581, 960543295 - (ViewConfiguration.getTouchSlop() >> 8), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 106), View.MeasureSpec.getMode(0) - 57, (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr16);
        String str12 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.klik_bca_continue).substring(39, 48).codePointAt(3) - 162510659, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_invalid_parameter).substring(0, 23).codePointAt(3) + 960543200, (short) (ViewConfiguration.getTouchSlop() >> 8), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 156, (byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr17);
        String str13 = (String) objArr17[0];
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 603521478;
        if (i4 != 2111123856 + (((~((-277357867) | i5)) | (~((~i5) | (-1107345410)))) * (-318)) + (((-1471086064) | (~(363740654 | i5))) * (-318)) + (((~(i5 | (-363740655))) | 1193728197) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
            int i6 = 37290664 % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        int i9 = 420454956 + ((1362638872 | i8) * 614);
        int i10 = ~i8;
        if (i7 != i9 + (((~(i10 | 1683009202)) | (~((-896046763) | i10)) | 287838216) * (-1228)) + (((~((-608208547) | i10)) | (~(i10 | 1970847418))) * 614)) {
            throw new RuntimeException("-2031094495");
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatTimeout = (char) (43042 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
            int absoluteGravity = 3111 - Gravity.getAbsoluteGravity(0, 0);
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22;
            byte[] bArr = $$g;
            Object[] objArr18 = new Object[1];
            i(bArr[132], bArr[10], (byte) 52, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, absoluteGravity, doubleTapTimeout, -1272852037, false, (String) objArr18[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i11 = asBinder + 21;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 43043);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 3112;
                int mode = 22 - View.MeasureSpec.getMode(0);
                byte[] bArr2 = $$g;
                Object[] objArr19 = new Object[1];
                i((short) 103, bArr2[10], (byte) (bArr2[208] - 1), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iLastIndexOf, mode, 154975793, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i13 = ((int[]) objArr20[2])[0];
            int i14 = ((int[]) objArr20[1])[0];
            String[] strArr = (String[]) objArr20[3];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 25262846;
            int i15 = ~length;
            int i16 = 1061011799 + (((~((-1624553632) | i15)) | 1611923484) * 98) + (((~(i15 | (-80477828))) | (-1624553632) | (~(80477827 | length))) * (-49)) + (((~(length | (-1624553632))) | (-1692401312)) * 49) + 2108383056;
            int i17 = i16 ^ (i16 << 13);
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
            objArr = new Object[]{new int[1], new int[]{i14}, new int[]{i13}, strArr};
            str6 = "android.app.ActivityThread";
            str7 = "currentApplication";
            i = 1;
            str11 = str11;
        } else {
            try {
                Object[] objArr21 = {null, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue()), 0, 2108383056};
                byte[] bArr3 = $$m;
                Object[] objArr22 = new Object[1];
                k((short) 371, (byte) (-bArr3[299]), bArr3[9], objArr22);
                Class<?> cls = Class.forName((String) objArr22[0]);
                byte b2 = bArr3[273];
                Object[] objArr23 = new Object[1];
                k((short) 354, b2, (byte) (b2 | 8), objArr23);
                Object[] objArr24 = (Object[]) cls.getMethod((String) objArr23[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr21);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char capsMode = (char) (43042 - TextUtils.getCapsMode("", 0, 0));
                    int i19 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3112;
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 22;
                    byte[] bArr4 = $$g;
                    Object[] objArr25 = new Object[1];
                    i((short) 103, bArr4[10], (byte) (bArr4[208] - 1), objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, i19, maxKeyCode, 154975793, false, (String) objArr25[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr24);
                try {
                    long jLongValue = ((Long) Class.forName(str8).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cBlue = (char) (43042 - Color.blue(0));
                        int absoluteGravity2 = 3111 - Gravity.getAbsoluteGravity(0, 0);
                        int iCombineMeasuredStates = 22 - View.combineMeasuredStates(0, 0);
                        Object[] objArr26 = new Object[1];
                        i((short) 51, $$g[10], (byte) 52, objArr26);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, absoluteGravity2, iCombineMeasuredStates, -1269618118, false, (String) objArr26[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43042);
                        int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 3111;
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 22;
                        byte[] bArr5 = $$g;
                        Object[] objArr27 = new Object[1];
                        i(bArr5[132], bArr5[10], (byte) 52, objArr27);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, capsMode2, offsetAfter, -1272852037, false, (String) objArr27[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                    objArr = objArr24;
                    i = 1;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[i])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                for (String str14 : strArr2) {
                    arrayList.add(str14);
                }
            }
            throw null;
        }
        Object[] objArr28 = new Object[4];
        objArr28[0] = new int[i];
        int[] iArr = new int[i];
        objArr28[i] = iArr;
        int[] iArr2 = new int[i];
        objArr28[2] = iArr2;
        int i20 = ((int[]) objArr[0])[0];
        int i21 = ((int[]) objArr[2])[0];
        int i22 = ((int[]) objArr[i])[0];
        String[] strArr3 = (String[]) objArr[3];
        iArr2[0] = i21;
        iArr[0] = i22;
        int iMyTid = Process.myTid();
        int i23 = ~iMyTid;
        int i24 = i20 + (-1272411950) + (((~((-1527231836) | i23)) | 167838019) * 168) + ((~((-167838020) | iMyTid)) * 168) + (((~(iMyTid | (-1359393817))) | (~(i23 | (-177799624))) | 9961604) * 168);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr28[0])[0] = i26 ^ (i26 << 5);
        objArr28[3] = strArr3;
        int i27 = asBinder + 35;
        asInterface = i27 % 128;
        int i28 = i27 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int iArgb = Color.argb(0, 0, 0, 0) + 876;
            int i29 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte[] bArr6 = $$g;
            Object[] objArr29 = new Object[1];
            i((short) 103, bArr6[10], (byte) (bArr6[208] - 1), objArr29);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout, iArgb, i29, -1650998592, false, (String) objArr29[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
        long jLongValue2 = ((Long) Class.forName(str8).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            int iResolveSize = View.resolveSize(0, 0) + 876;
            int deadChar = 10 - KeyEvent.getDeadChar(0, 0);
            Object[] objArr30 = new Object[1];
            i((short) 51, $$g[10], (byte) 52, objArr30);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(offsetBefore, iResolveSize, deadChar, 2012020043, false, (String) objArr30[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int keyRepeatDelay = 876 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iResolveSize2 = 10 - View.resolveSize(0, 0);
                byte[] bArr7 = $$g;
                Object[] objArr31 = new Object[1];
                i(bArr7[132], bArr7[10], (byte) 52, objArr31);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(longPressTimeout2, keyRepeatDelay, iResolveSize2, 2012931276, false, (String) objArr31[0], null);
            }
            Object[] objArr32 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr32[0])[0]}, new int[1], new int[]{((int[]) objArr32[2])[0]}, (String[]) objArr32[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i30 = ~iIdentityHashCode;
            int i31 = (~(242912677 | i30)) | (-519811072) | (~(283222906 | i30));
            int i32 = (-1142039020) + (((~(iIdentityHashCode | (-6324513))) | i31) * 590) + (i31 * (-1180)) + (((~((-283222907) | i30)) | (~(i30 | (-242912678)))) * 590) + 542953176;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr2[1])[0] = i34 ^ (i34 << 5);
            str = str9;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                baseContext = (Context) Class.forName(str12).getMethod(str13, new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i35 = asBinder + 113;
                asInterface = i35 % 128;
                if (i35 % 2 != 0) {
                    int i36 = 68 / 0;
                    if (!(!(baseContext instanceof ContextWrapper))) {
                        if (((ContextWrapper) baseContext).getBaseContext() != null) {
                            baseContext = null;
                        }
                    }
                } else if (baseContext instanceof ContextWrapper) {
                    if (((ContextWrapper) baseContext).getBaseContext() != null) {
                        baseContext = null;
                    }
                }
                baseContext = baseContext.getApplicationContext();
            }
            str11 = str11;
            Object[] objArr33 = {baseContext, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue()), 0, 542953176};
            byte[] bArr8 = $$m;
            Object[] objArr34 = new Object[1];
            k((short) 302, (byte) (-bArr8[21]), bArr8[213], objArr34);
            Class<?> cls2 = Class.forName((String) objArr34[0]);
            byte b3 = bArr8[273];
            Object[] objArr35 = new Object[1];
            k((short) 262, b3, (byte) (b3 | 8), objArr35);
            Object[] objArr36 = (Object[]) cls2.getMethod((String) objArr35[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr33);
            if (baseContext != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char cIndexOf2 = (char) TextUtils.indexOf("", "");
                    int maxKeyCode2 = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                    int touchSlop = 10 - (ViewConfiguration.getTouchSlop() >> 8);
                    byte[] bArr9 = $$g;
                    Object[] objArr37 = new Object[1];
                    i(bArr9[132], bArr9[10], (byte) 52, objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf2, maxKeyCode2, touchSlop, 2012931276, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArr36);
                try {
                    str = str9;
                    long jLongValue3 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 877;
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 10;
                        Object[] objArr38 = new Object[1];
                        i((short) 51, $$g[10], (byte) 52, objArr38);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(packedPositionChild, iIndexOf, scrollBarSize, 2012020043, false, (String) objArr38[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 876;
                        int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10;
                        byte[] bArr10 = $$g;
                        Object[] objArr39 = new Object[1];
                        i((short) 103, bArr10[10], (byte) (bArr10[208] - 1), objArr39);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(trimmedLength, maximumDrawingCacheSize, doubleTapTimeout2, -1650998592, false, (String) objArr39[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } else {
                str11 = str11;
                str = str9;
                objArr36 = objArr36;
            }
            objArr2 = objArr36;
        }
        int i37 = ((int[]) objArr2[2])[0];
        int i38 = ((int[]) objArr2[0])[0];
        if (i38 == i37) {
            int i39 = ((int[]) objArr2[1])[0];
            Object[] objArr40 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            str2 = str7;
            int i40 = ((Context) Class.forName(str6).getMethod(str2, new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i41 = ~i40;
            int i42 = i39 + (-219778240) + (((~(64220413 | i41)) | 104530642) * 226) + (((~(i41 | 133951231)) | (~((-104530643) | i40)) | 34799824) * (-113)) + ((~(i40 | 64220413)) * 113);
            int i43 = i42 ^ (i42 << 13);
            int i44 = i43 ^ (i43 >>> 17);
            ((int[]) objArr40[1])[0] = i44 ^ (i44 << 5);
        } else {
            str2 = str7;
            int[] iArr3 = new int[i38];
            int i45 = i38 - 1;
            iArr3[i45] = 1;
            Toast.makeText((Context) null, iArr3[((i38 * i45) % 2) - 1], 1).show();
            int i46 = ((int[]) objArr2[1])[0];
            Object[] objArr41 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int i47 = ((Context) Class.forName(str6).getMethod(str2, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i48 = ~i47;
            int i49 = i46 + (-24839660) + (((~(832803949 | i48)) | (-873114179) | (~((-832803950) | i47))) * (-564)) + ((~(i47 | (-805470273))) * 1128) + (((~((-873114179) | i48)) | 27333677) * 564);
            int i50 = (i49 << 13) ^ i49;
            int i51 = i50 ^ (i50 >>> 17);
            ((int[]) objArr41[1])[0] = i51 ^ (i51 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int i52 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int size = View.MeasureSpec.getSize(0) + 10;
            short s = (short) 103;
            Object[] objArr42 = new Object[1];
            i(s, (byte) (s & 29), $$g[7], objArr42);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cKeyCodeFromString, i52, size, 252381699, false, (String) objArr42[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null);
        long jLongValue4 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
            int i53 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
            Object[] objArr43 = new Object[1];
            i((short) 140, $$g[10], (byte) 52, objArr43);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf3, i53, pressedStateDuration, 2009631821, false, (String) objArr43[0], null);
        }
        if (j2 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char cBlue2 = (char) Color.blue(0);
                int iIndexOf2 = 875 - TextUtils.indexOf((CharSequence) "", '0');
                int iIndexOf3 = TextUtils.indexOf("", "", 0) + 10;
                short s2 = (short) DerHeader.TAG_CLASS_PRIVATE;
                byte b4 = $$g[7];
                Object[] objArr44 = new Object[1];
                i(s2, b4, b4, objArr44);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cBlue2, iIndexOf2, iIndexOf3, 256017550, false, (String) objArr44[0], null);
            }
            Object[] objArr45 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr45[0])[0]}, new int[1], new int[]{((int[]) objArr45[2])[0]}, (String[]) objArr45[3]};
            int i54 = ~((Context) Class.forName(str6).getMethod(str2, new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            int i55 = (-942559356) + (((~((-2361905) | i54)) | 42672133) * (-828)) + ((i54 | (-2361905)) * (-828)) + 799852375;
            int i56 = (i55 << 13) ^ i55;
            int i57 = i56 ^ (i56 >>> 17);
            ((int[]) objArr3[1])[0] = i57 ^ (i57 << 5);
            str4 = str;
            str3 = str11;
            str2 = str2;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                baseContext2 = (Context) Class.forName(str12).getMethod(str13, new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            str3 = str11;
            Object[] objArr46 = {baseContext2, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str3, Object.class).invoke(null, this)).intValue()), -1155804137};
            byte[] bArr11 = $$m;
            Object[] objArr47 = new Object[1];
            k((short) 210, bArr11[330], bArr11[213], objArr47);
            Class<?> cls3 = Class.forName((String) objArr47[0]);
            byte b5 = bArr11[273];
            Object[] objArr48 = new Object[1];
            k((short) 262, b5, (byte) (b5 | 8), objArr48);
            Object[] objArr49 = (Object[]) cls3.getMethod((String) objArr48[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr46);
            if (baseContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char doubleTapTimeout3 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 877;
                    int iMyTid2 = 10 - (Process.myTid() >> 22);
                    short s3 = (short) DerHeader.TAG_CLASS_PRIVATE;
                    byte b6 = $$g[7];
                    Object[] objArr50 = new Object[1];
                    i(s3, b6, b6, objArr50);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(doubleTapTimeout3, iLastIndexOf2, iMyTid2, 256017550, false, (String) objArr50[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr49);
                try {
                    str4 = str;
                    long jLongValue5 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue5);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int iIndexOf4 = 876 - TextUtils.indexOf("", "", 0);
                        int packedPositionChild2 = 9 - ExpandableListView.getPackedPositionChild(0L);
                        Object[] objArr51 = new Object[1];
                        i((short) 140, $$g[10], (byte) 52, objArr51);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cMyTid, iIndexOf4, packedPositionChild2, 2009631821, false, (String) objArr51[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue5 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int iAlpha = Color.alpha(0) + 876;
                        int edgeSlop = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                        short s4 = (short) 103;
                        Object[] objArr52 = new Object[1];
                        i(s4, (byte) (s4 & 29), $$g[7], objArr52);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(keyRepeatTimeout2, iAlpha, edgeSlop, 252381699, false, (String) objArr52[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            } else {
                str2 = str2;
                str4 = str;
                objArr49 = objArr49;
            }
            objArr3 = objArr49;
        }
        int i58 = ((int[]) objArr3[2])[0];
        int i59 = ((int[]) objArr3[0])[0];
        if (i59 == i58) {
            int i60 = asInterface + 125;
            asBinder = i60 % 128;
            int i61 = i60 % 2;
            int i62 = ((int[]) objArr3[1])[0];
            Object[] objArr53 = {new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i63 = (-1514221428) + ((iUptimeMillis | 477056200) * (-50));
            int i64 = ~((-73877513) | iUptimeMillis);
            int i65 = ~iUptimeMillis;
            int i66 = i62 + i63 + ((i64 | (~(510623483 | i65))) * 50) + (((~(i65 | 477056200)) | (~(436745971 | i65)) | (-510623484)) * 50);
            int i67 = i66 ^ (i66 << 13);
            int i68 = i67 ^ (i67 >>> 17);
            ((int[]) objArr53[1])[0] = i68 ^ (i68 << 5);
        } else {
            int[] iArr4 = new int[i59];
            int i69 = i59 - 1;
            iArr4[i69] = 1;
            Toast.makeText((Context) null, iArr4[((i59 * i69) % 2) - 1], 1).show();
            int i70 = ((int[]) objArr3[1])[0];
            Object[] objArr54 = {new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i71 = i70 + (((~((-33587491) | iElapsedRealtime)) | 417800) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 183529122 + ((~((~iElapsedRealtime) | (-33587491))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
            int i72 = (i71 << 13) ^ i71;
            int i73 = i72 ^ (i72 >>> 17);
            ((int[]) objArr54[1])[0] = i73 ^ (i73 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char scrollBarSize2 = (char) (53893 - (ViewConfiguration.getScrollBarSize() >> 8));
            int i74 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1319;
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36;
            short s5 = (short) 103;
            Object[] objArr55 = new Object[1];
            i(s5, (byte) (s5 & 29), $$g[7], objArr55);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(scrollBarSize2, i74, maximumFlingVelocity, -1433084963, false, (String) objArr55[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null) != -1) {
            int i75 = asInterface + 65;
            asBinder = i75 % 128;
            int i76 = i75 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char cRed = (char) (Color.red(0) + 53893);
                int iArgb2 = Color.argb(0, 0, 0, 0) + 1320;
                int deadChar2 = 36 - KeyEvent.getDeadChar(0, 0);
                Object[] objArr56 = new Object[1];
                i((short) 51, $$g[10], (byte) 52, objArr56);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cRed, iArgb2, deadChar2, -1920778747, false, (String) objArr56[0], null);
            }
            Object[] objArr57 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).get(null);
            objArr4 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i77 = ((int[]) objArr57[0])[0];
            int i78 = ((int[]) objArr57[3])[0];
            String[] strArr4 = (String[]) objArr57[2];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i79 = ~iIdentityHashCode2;
            int i80 = ((((-1455092552) + ((((~((-785613910) | i79)) | (-585013916)) | (~(785613909 | iIdentityHashCode2))) * (-564))) + ((~(iIdentityHashCode2 | (-793227))) * 1128)) + (((~((-585013916) | i79)) | (-786407136)) * 564)) - 964915606;
            int i81 = (i80 << 13) ^ i80;
            int i82 = i81 ^ (i81 >>> 17);
            ((int[]) objArr4[1])[0] = i82 ^ (i82 << 5);
        } else {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                baseContext3 = (Context) Class.forName(str12).getMethod(str13, new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                baseContext3 = ((baseContext3 instanceof ContextWrapper) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
            }
            int iIntValue = ((Integer) Class.forName(str10).getMethod(str3, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr58 = {-1075583700};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 47976), (Process.myTid() >> 22) + 1300, 20 - (ViewConfiguration.getWindowTouchSlop() >> 8), -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr59 = {baseContext3, "com.bpjstku", -964915606, Integer.valueOf(iIntValue), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).newInstance(objArr58), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char cResolveSize = (char) (53893 - View.resolveSize(0, 0));
                    int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1321;
                    int iIndexOf6 = TextUtils.indexOf((CharSequence) "", '0', 0) + 37;
                    Object[] objArr60 = new Object[1];
                    i((short) 51, $$g[10], (byte) 52, objArr60);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cResolveSize, iIndexOf5, iIndexOf6, 819724799, false, (String) objArr60[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 57878), 1394 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 75), Boolean.TYPE});
                }
                Object[] objArr61 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).invoke(null, objArr59);
                if (baseContext3 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                        char scrollBarSize3 = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 53893);
                        int i83 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1321;
                        int packedPositionGroup = 36 - ExpandableListView.getPackedPositionGroup(0L);
                        Object[] objArr62 = new Object[1];
                        i((short) 51, $$g[10], (byte) 52, objArr62);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(scrollBarSize3, i83, packedPositionGroup, -1920778747, false, (String) objArr62[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, objArr61);
                    try {
                        long jLongValue6 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf7 = Long.valueOf(jLongValue6);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                            char cRed2 = (char) (Color.red(0) + 53893);
                            int edgeSlop2 = 1320 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int iIndexOf7 = 36 - TextUtils.indexOf("", "", 0, 0);
                            byte[] bArr12 = $$g;
                            Object[] objArr63 = new Object[1];
                            i((short) 103, bArr12[10], (byte) (bArr12[208] - 1), objArr63);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cRed2, edgeSlop2, iIndexOf7, -1273706634, false, (String) objArr63[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, lValueOf7);
                        Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                            char c3 = (char) (53894 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            int iAxisFromString = MotionEvent.axisFromString("") + 1321;
                            int size2 = 36 - View.MeasureSpec.getSize(0);
                            short s6 = (short) 103;
                            Object[] objArr64 = new Object[1];
                            i(s6, (byte) (s6 & 29), $$g[7], objArr64);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(c3, iAxisFromString, size2, -1433084963, false, (String) objArr64[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, lValueOf8);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr61 = objArr61;
                }
                objArr4 = objArr61;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i84 = ((int[]) objArr4[3])[0];
        int i85 = ((int[]) objArr4[0])[0];
        if (i85 != i84) {
            throw new RuntimeException(String.valueOf(i85));
        }
        Object[] objArr65 = {new int[]{i}, new int[1], strArr, new int[]{i}};
        int i86 = ((int[]) objArr4[1])[0];
        int i87 = ((int[]) objArr4[0])[0];
        int i88 = ((int[]) objArr4[3])[0];
        String[] strArr5 = (String[]) objArr4[2];
        String str15 = str2;
        int iCodePointAt = ((Context) Class.forName(str6).getMethod(str15, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.permata_instruction_step6).substring(6, 7).codePointAt(0) - 306057377;
        int i89 = i86 + (-314656739) + (((~(iCodePointAt | 759605761)) | 611022063) * 191) + (((~(759605761 | (~iCodePointAt))) | 2708718) * 191);
        int i90 = (i89 << 13) ^ i89;
        int i91 = i90 ^ (i90 >>> 17);
        ((int[]) objArr65[1])[0] = i91 ^ (i91 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
            char keyRepeatDelay2 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31533);
            int gidForName = Process.getGidForName("") + 922;
            int deadChar3 = KeyEvent.getDeadChar(0, 0) + 28;
            short s7 = (short) 103;
            Object[] objArr66 = new Object[1];
            i(s7, (byte) (s7 & 29), $$g[7], objArr66);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(keyRepeatDelay2, gidForName, deadChar3, -1048449946, false, (String) objArr66[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 31533);
                int i92 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 921;
                int mode2 = 28 - View.MeasureSpec.getMode(0);
                byte[] bArr13 = $$g;
                Object[] objArr67 = new Object[1];
                i((short) 103, bArr13[10], (byte) (bArr13[208] - 1), objArr67);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cMakeMeasureSpec, i92, mode2, -1142834547, false, (String) objArr67[0], null);
            }
            Object[] objArr68 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).get(null);
            objArr5 = new Object[]{new int[1], new int[]{((int[]) objArr68[1])[0]}, (Object[]) objArr68[2], new int[]{((int[]) objArr68[3])[0]}, (String[]) objArr68[4]};
            int iNextInt = new Random().nextInt();
            int i93 = ((1702492072 + (((~(iNextInt | 217803150)) | (-1560014224)) * 305)) + (((~((~iNextInt) | 217803150)) | (-1556276494)) * 305)) - 87842469;
            int i94 = (i93 << 13) ^ i93;
            int i95 = i94 ^ (i94 >>> 17);
            ((int[]) objArr5[0])[0] = i95 ^ (i95 << 5);
            int i96 = asInterface + 11;
            asBinder = i96 % 128;
            int i97 = i96 % 2;
            str13 = str13;
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                baseContext4 = (Context) Class.forName(str12).getMethod(str13, new Class[0]).invoke(null, null);
            }
            if (baseContext4 != null) {
                if (baseContext4 instanceof ContextWrapper) {
                    int i98 = asInterface + 73;
                    asBinder = i98 % 128;
                    int i99 = i98 % 2;
                    if (((ContextWrapper) baseContext4).getBaseContext() != null) {
                        baseContext4 = baseContext4.getApplicationContext();
                    } else {
                        baseContext4 = null;
                    }
                } else {
                    baseContext4 = baseContext4.getApplicationContext();
                }
            }
            Object[] objArr69 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str3, Object.class).invoke(null, this)).intValue()), 0, -87842469};
            short s8 = (short) ($$n & PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW);
            byte[] bArr14 = $$m;
            Object[] objArr70 = new Object[1];
            k(s8, bArr14[4], bArr14[85], objArr70);
            Class<?> cls4 = Class.forName((String) objArr70[0]);
            byte b7 = bArr14[273];
            Object[] objArr71 = new Object[1];
            k((short) 354, b7, (byte) (b7 | 8), objArr71);
            Object[] objArr72 = (Object[]) cls4.getMethod((String) objArr71[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr69);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                char c4 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31532);
                int iGreen = Color.green(0) + 921;
                int iRgb = (-16777188) - Color.rgb(0, 0, 0);
                byte[] bArr15 = $$g;
                Object[] objArr73 = new Object[1];
                i((short) 103, bArr15[10], (byte) (bArr15[208] - 1), objArr73);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(c4, iGreen, iRgb, -1142834547, false, (String) objArr73[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, objArr72);
            try {
                long jLongValue7 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf9 = Long.valueOf(jLongValue7);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                    char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 31533);
                    int i100 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 921;
                    int mode3 = View.MeasureSpec.getMode(0) + 28;
                    Object[] objArr74 = new Object[1];
                    i((short) 51, $$g[10], (byte) 52, objArr74);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(threadPriority, i100, mode3, -778300370, false, (String) objArr74[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, lValueOf9);
                Long lValueOf10 = Long.valueOf(jLongValue7 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char scrollBarSize4 = (char) (31533 - (ViewConfiguration.getScrollBarSize() >> 8));
                    int pressedStateDuration2 = 921 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iAxisFromString2 = MotionEvent.axisFromString("") + 29;
                    short s9 = (short) 103;
                    Object[] objArr75 = new Object[1];
                    i(s9, (byte) (s9 & 29), $$g[7], objArr75);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(scrollBarSize4, pressedStateDuration2, iAxisFromString2, -1048449946, false, (String) objArr75[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf10);
                objArr5 = objArr72;
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        }
        int i101 = ((int[]) objArr5[1])[0];
        int i102 = ((int[]) objArr5[3])[0];
        if (i102 == i101) {
            int i103 = ((int[]) objArr5[0])[0];
            Object[] objArr76 = {new int[1], new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[]{((int[]) objArr5[3])[0]}, (String[]) objArr5[4]};
            int i104 = ~((~((Context) Class.forName(str6).getMethod(str15, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp) | 924491914);
            int i105 = i103 + (((85459082 | i104) * (-374)) - 889628617) + ((i104 | 839032832) * 374);
            int i106 = (i105 << 13) ^ i105;
            int i107 = i106 ^ (i106 >>> 17);
            ((int[]) objArr76[0])[0] = i107 ^ (i107 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr6 = (String[]) objArr5[4];
            if (strArr6 != null) {
                for (String str16 : strArr6) {
                    arrayList2.add(str16);
                }
            }
            Toast.makeText((Context) null, i102 / (((i102 - 1) * i102) % 2), 0).show();
            int i108 = ((int[]) objArr5[0])[0];
            Object[] objArr77 = {new int[1], new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[]{((int[]) objArr5[3])[0]}, (String[]) objArr5[4]};
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int i109 = ~iUptimeMillis2;
            int i110 = i108 + ((((~(i109 | 1278554848)) | ((~((-495524796) | i109)) | 294127899)) * (-397)) - 655864997) + ((iUptimeMillis2 | 1371285851) * 397);
            int i111 = (i110 << 13) ^ i110;
            int i112 = i111 ^ (i111 >>> 17);
            ((int[]) objArr77[0])[0] = i112 ^ (i112 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
            char doubleTapTimeout4 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int maximumFlingVelocity2 = 876 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int i113 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            short s10 = (short) DerHeader.TAG_CLASS_PRIVATE;
            byte[] bArr16 = $$g;
            Object[] objArr78 = new Object[1];
            i(s10, bArr16[19], (byte) (-bArr16[9]), objArr78);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(doubleTapTimeout4, maximumFlingVelocity2, i113, -1199417970, false, (String) objArr78[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).getLong(null);
        long jLongValue8 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
            int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte[] bArr17 = $$g;
            Object[] objArr79 = new Object[1];
            i((short) 202, (byte) (-bArr17[14]), bArr17[7], objArr79);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(cCombineMeasuredStates, fadingEdgeLength, windowTouchSlop, 254769921, false, (String) objArr79[0], null);
        }
        if (j3 == ((jLongValue8 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).getLong(null) << 52) >>> 52)) >> 12)) {
            int i114 = asInterface + 49;
            asBinder = i114 % 128;
            int i115 = i114 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                char cIndexOf4 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                int maximumFlingVelocity3 = 876 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int i116 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10;
                byte[] bArr18 = $$g;
                Object[] objArr80 = new Object[1];
                i((short) 202, bArr18[19], bArr18[129], objArr80);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cIndexOf4, maximumFlingVelocity3, i116, 1324201839, false, (String) objArr80[0], null);
            }
            Object[] objArr81 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).get(null);
            objArr6 = new Object[]{new int[]{((int[]) objArr81[0])[0]}, new int[1], new int[]{((int[]) objArr81[2])[0]}, (String[]) objArr81[3]};
            int i117 = ~((int) Process.getStartUptimeMillis());
            int i118 = 72609308 + ((~((-26804481) | i117)) * 52) + (((~(474119933 | i117)) | (~(433809704 | i117)) | (-500924414)) * (-52)) + (((~(i117 | (-474119934))) | 407005224) * 52) + 1237973728;
            int i119 = (i118 << 13) ^ i118;
            int i120 = i119 ^ (i119 >>> 17);
            ((int[]) objArr6[1])[0] = i120 ^ (i120 << 5);
        } else {
            Object[] objArr82 = {Integer.valueOf(((Integer) Class.forName(str10).getMethod(str3, Object.class).invoke(null, this)).intValue()), 1237973728};
            byte[] bArr19 = $$m;
            Object[] objArr83 = new Object[1];
            k((short) 86, bArr19[4], bArr19[213], objArr83);
            Class<?> cls5 = Class.forName((String) objArr83[0]);
            byte b8 = bArr19[273];
            Object[] objArr84 = new Object[1];
            k((short) 262, b8, (byte) (b8 | 8), objArr84);
            objArr6 = (Object[]) cls5.getMethod((String) objArr84[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr82);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 877;
                int iRgb2 = (-16777206) - Color.rgb(0, 0, 0);
                byte[] bArr20 = $$g;
                Object[] objArr85 = new Object[1];
                i((short) 202, bArr20[19], bArr20[129], objArr85);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cLastIndexOf, iLastIndexOf3, iRgb2, 1324201839, false, (String) objArr85[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, objArr6);
            try {
                long jLongValue9 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf11 = Long.valueOf(jLongValue9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                    char cIndexOf5 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int i121 = 877 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int touchSlop2 = 10 - (ViewConfiguration.getTouchSlop() >> 8);
                    byte[] bArr21 = $$g;
                    Object[] objArr86 = new Object[1];
                    i((short) 202, (byte) (-bArr21[14]), bArr21[7], objArr86);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(cIndexOf5, i121, touchSlop2, 254769921, false, (String) objArr86[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, lValueOf11);
                Long lValueOf12 = Long.valueOf(jLongValue9 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char cIndexOf6 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                    int mirror = AndroidCharacter.getMirror('0') + 828;
                    int longPressTimeout3 = 10 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    short s11 = (short) DerHeader.TAG_CLASS_PRIVATE;
                    byte[] bArr22 = $$g;
                    Object[] objArr87 = new Object[1];
                    i(s11, bArr22[19], (byte) (-bArr22[9]), objArr87);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(cIndexOf6, mirror, longPressTimeout3, -1199417970, false, (String) objArr87[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, lValueOf12);
            } catch (Exception unused6) {
                throw new RuntimeException();
            }
        }
        int i122 = ((int[]) objArr6[2])[0];
        int i123 = ((int[]) objArr6[0])[0];
        if (i123 != i122) {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr7 = (String[]) objArr6[3];
            if (strArr7 != null) {
                for (String str17 : strArr7) {
                    arrayList3.add(str17);
                }
            }
            throw new RuntimeException(String.valueOf(i123));
        }
        int i124 = ((int[]) objArr6[1])[0];
        Object[] objArr88 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i125 = i124 + (-1052189340) + (((~(458394779 | iIdentityHashCode3)) | (-498705009)) * (-948)) + ((~((~iIdentityHashCode3) | (-78193249))) * (-948)) + 1879308668;
        int i126 = (i125 << 13) ^ i125;
        int i127 = i126 ^ (i126 >>> 17);
        ((int[]) objArr88[1])[0] = i127 ^ (i127 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
            char c5 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
            int doubleTapTimeout5 = 651 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iBlue = Color.blue(0) + 44;
            Object[] objArr89 = new Object[1];
            i((short) 140, $$g[10], (byte) 52, objArr89);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(c5, doubleTapTimeout5, iBlue, -459846511, false, (String) objArr89[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).getLong(null);
        long jLongValue10 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
            char mirror2 = (char) (AndroidCharacter.getMirror('0') - '0');
            int gidForName2 = 650 - Process.getGidForName("");
            int mirror3 = '\\' - AndroidCharacter.getMirror('0');
            short s12 = (short) 103;
            Object[] objArr90 = new Object[1];
            i(s12, (byte) (s12 & 29), $$g[7], objArr90);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(mirror2, gidForName2, mirror3, -873460649, false, (String) objArr90[0], null);
        }
        if (j4 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                char c6 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int iIndexOf8 = TextUtils.indexOf((CharSequence) "", '0') + 652;
                int bitsPerPixel = 43 - ImageFormat.getBitsPerPixel(0);
                byte[] bArr23 = $$g;
                Object[] objArr91 = new Object[1];
                i((short) 103, bArr23[10], (byte) (bArr23[208] - 1), objArr91);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(c6, iIndexOf8, bitsPerPixel, -1595579076, false, (String) objArr91[0], null);
            }
            Object[] objArr92 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).get(null);
            objArr7 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i128 = ((int[]) objArr92[2])[0];
            int i129 = ((int[]) objArr92[0])[0];
            int i130 = ((Context) Class.forName(str6).getMethod(str15, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1646375629;
            int i131 = (((1190975719 + (((~((-4754113) | i130)) | (~((~i130) | (-1323303)))) * (-318))) + (((~(594120400 | i130)) | (-595443703)) * (-318))) + (((~(i130 | (-594120401))) | 590689590) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) - 616503675;
            int i132 = (i131 << 13) ^ i131;
            int i133 = i132 ^ (i132 >>> 17);
            ((int[]) objArr7[3])[0] = i133 ^ (i133 << 5);
            i2 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1610, 'J' - AndroidCharacter.getMirror('0'), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr93 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).newInstance(null), -616503675, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int mirror4 = AndroidCharacter.getMirror('0') + 603;
                int iMyPid = 44 - (Process.myPid() >> 22);
                short s13 = (short) 103;
                Object[] objArr94 = new Object[1];
                i(s13, (byte) (s13 & 29), $$g[7], objArr94);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cResolveSizeAndState, mirror4, iMyPid, 2075921419, false, (String) objArr94[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 695 - TextUtils.getOffsetAfter("", 0), 98 - (ViewConfiguration.getEdgeSlop() >> 16)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (Process.myPid() >> 22)), 793 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getFadingEdgeLength() >> 16) + 83), Integer.TYPE, Integer.TYPE});
            }
            objArr7 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).invoke(null, objArr93);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                char scrollBarSize5 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int iMyTid3 = 651 - (Process.myTid() >> 22);
                int edgeSlop3 = 44 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte[] bArr24 = $$g;
                Object[] objArr95 = new Object[1];
                i((short) 103, bArr24[10], (byte) (bArr24[208] - 1), objArr95);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(scrollBarSize5, iMyTid3, edgeSlop3, -1595579076, false, (String) objArr95[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, objArr7);
            try {
                long jLongValue11 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf13 = Long.valueOf(jLongValue11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                    char doubleTapTimeout6 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iIndexOf9 = 651 - TextUtils.indexOf("", "");
                    int i134 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43;
                    short s14 = (short) 103;
                    Object[] objArr96 = new Object[1];
                    i(s14, (byte) (s14 & 29), $$g[7], objArr96);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(doubleTapTimeout6, iIndexOf9, i134, -873460649, false, (String) objArr96[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf13);
                Long lValueOf14 = Long.valueOf(jLongValue11 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                    char cMyTid2 = (char) (Process.myTid() >> 22);
                    int size3 = 651 - View.MeasureSpec.getSize(0);
                    int iMyPid2 = (Process.myPid() >> 22) + 44;
                    Object[] objArr97 = new Object[1];
                    i((short) 140, $$g[10], (byte) 52, objArr97);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(cMyTid2, size3, iMyPid2, -459846511, false, (String) objArr97[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf14);
                i2 = 0;
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        }
        int i135 = ((int[]) objArr7[i2])[i2];
        int i136 = ((int[]) objArr7[2])[i2];
        if (i136 != i135) {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr8 = (String[]) objArr7[1];
            if (strArr8 != null) {
                for (int i137 = i2; i137 < strArr8.length; i137++) {
                    arrayList4.add(strArr8[i137]);
                }
            }
            throw new RuntimeException(String.valueOf(i136));
        }
        Object[] objArr98 = new Object[4];
        int[] iArr5 = new int[1];
        objArr98[i2] = iArr5;
        int[] iArr6 = new int[1];
        objArr98[2] = iArr6;
        objArr98[3] = new int[1];
        int i138 = ((int[]) objArr7[3])[i2];
        int i139 = ((int[]) objArr7[2])[i2];
        int i140 = ((int[]) objArr7[i2])[i2];
        iArr6[i2] = i139;
        iArr5[i2] = i140;
        objArr98[1] = new String[i2];
        int i141 = ((Context) Class.forName(str6).getMethod(str15, new Class[i2]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        int i142 = i138 + (-1036065969) + (((~(397160546 | i141)) | 798722) * (-502)) + ((~((~i141) | 401390078)) * (-502)) + (((~(i141 | (-400591357))) | 397160546) * TypedValues.PositionType.TYPE_DRAWPATH);
        int i143 = (i142 << 13) ^ i142;
        int i144 = i143 ^ (i143 >>> 17);
        ((int[]) objArr98[3])[0] = i144 ^ (i144 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char cRed3 = (char) Color.red(0);
            int i145 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1030;
            int iIndexOf10 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16;
            byte[] bArr25 = $$g;
            Object[] objArr99 = new Object[1];
            i(bArr25[132], bArr25[10], (byte) 52, objArr99);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cRed3, i145, iIndexOf10, 1357589585, false, (String) objArr99[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null);
        long jLongValue12 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
            char c7 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int trimmedLength2 = 1031 - TextUtils.getTrimmedLength("");
            int iIndexOf11 = 15 - TextUtils.indexOf("", "");
            Object[] objArr100 = new Object[1];
            i((short) 51, $$g[10], (byte) 52, objArr100);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(c7, trimmedLength2, iIndexOf11, 1344079056, false, (String) objArr100[0], null);
        }
        if (j5 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).getLong(null) << 52) >>> 52)) >> 12)) {
            int i146 = asBinder + 21;
            asInterface = i146 % 128;
            int i147 = i146 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char c8 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 1031;
                int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 15;
                short s15 = (short) 103;
                Object[] objArr101 = new Object[1];
                i(s15, (byte) (s15 & 29), $$g[7], objArr101);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(c8, offsetBefore2, pressedStateDuration3, 632103528, false, (String) objArr101[0], null);
            }
            Object[] objArr102 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).get(null);
            objArr8 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i148 = ((int[]) objArr102[3])[0];
            int i149 = ((int[]) objArr102[1])[0];
            String[] strArr9 = (String[]) objArr102[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i150 = ~startUptimeMillis;
            int i151 = 1241657168 + (((~((-253755525) | i150)) | (~((-336481) | startUptimeMillis)) | (~(263567358 | startUptimeMillis))) * 765) + (((~((-254092005) | i150)) | 253755524) * 1530) + (((~(startUptimeMillis | (-254092005))) | (~(i150 | 263567358))) * 765) + 1478750142;
            int i152 = (i151 << 13) ^ i151;
            int i153 = i152 ^ (i152 >>> 17);
            ((int[]) objArr8[2])[0] = i153 ^ (i153 << 5);
        } else {
            int iIntValue2 = ((Integer) Class.forName(str10).getMethod(str3, Object.class).invoke(null, this)).intValue();
            Object[] objArr103 = {-1058806081};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 46038), 1134 - Color.blue(0), TextUtils.indexOf((CharSequence) "", '0') + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr104 = {Integer.valueOf(iIntValue2), 0, 1478750142, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).newInstance(objArr103), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                char cResolveSize2 = (char) View.resolveSize(0, 0);
                int absoluteGravity3 = 1031 - Gravity.getAbsoluteGravity(0, 0);
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 16;
                byte[] bArr26 = $$g;
                Object[] objArr105 = new Object[1];
                i(bArr26[132], bArr26[10], (byte) 52, objArr105);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(cResolveSize2, absoluteGravity3, modifierMetaStateMask, 1298546779, false, (String) objArr105[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Drawable.resolveOpacity(0, 0) + 45993), 1118 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 17 - Color.argb(0, 0, 0, 0)), Boolean.TYPE});
            }
            objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).invoke(null, objArr104);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                char c9 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int iLastIndexOf4 = 1030 - TextUtils.lastIndexOf("", '0', 0, 0);
                int iIndexOf12 = TextUtils.indexOf((CharSequence) "", '0') + 16;
                short s16 = (short) 103;
                Object[] objArr106 = new Object[1];
                i(s16, (byte) (s16 & 29), $$g[7], objArr106);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(c9, iLastIndexOf4, iIndexOf12, 632103528, false, (String) objArr106[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, objArr8);
            try {
                long jLongValue13 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                    char c10 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int scrollBarFadeDuration = 1031 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iMyTid4 = (Process.myTid() >> 22) + 15;
                    Object[] objArr107 = new Object[1];
                    i((short) 51, $$g[10], (byte) 52, objArr107);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(c10, scrollBarFadeDuration, iMyTid4, 1344079056, false, (String) objArr107[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue13 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                    char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iIndexOf13 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
                    int i154 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                    byte[] bArr27 = $$g;
                    Object[] objArr108 = new Object[1];
                    i(bArr27[132], bArr27[10], (byte) 52, objArr108);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(fadingEdgeLength2, iIndexOf13, i154, 1357589585, false, (String) objArr108[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, lValueOf16);
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        int i155 = ((int[]) objArr8[1])[0];
        int i156 = ((int[]) objArr8[3])[0];
        if (i156 != i155) {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr10 = (String[]) objArr8[0];
            if (strArr10 != null) {
                for (String str18 : strArr10) {
                    arrayList5.add(str18);
                }
            }
            throw new RuntimeException(String.valueOf(i156));
        }
        Object[] objArr109 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i157 = ((int[]) objArr8[2])[0];
        int i158 = ((int[]) objArr8[3])[0];
        int i159 = ((int[]) objArr8[1])[0];
        String[] strArr11 = (String[]) objArr8[0];
        int i160 = ((Context) Class.forName(str6).getMethod(str15, new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        int i161 = ~i160;
        int i162 = i157 + (-1648014114) + (((~((-133674738) | i161)) | 110605432) * (-90)) + (((~((-133674738) | i160)) | (-133674746)) * (-45)) + (((~(i160 | (-110605433))) | (-133674738) | (~(i161 | 110605432))) * 45);
        int i163 = (i162 << 13) ^ i162;
        int i164 = i163 ^ (i163 >>> 17);
        ((int[]) objArr109[2])[0] = i164 ^ (i164 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
            char c11 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37567);
            int keyRepeatDelay3 = 625 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 14;
            short s17 = (short) 103;
            Object[] objArr110 = new Object[1];
            i(s17, (byte) (s17 & 29), $$g[7], objArr110);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(c11, keyRepeatDelay3, iCombineMeasuredStates2, -477065106, false, (String) objArr110[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).getLong(null);
        long jLongValue14 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16814783);
            int iIndexOf14 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 626;
            int i165 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14;
            byte[] bArr28 = $$g;
            Object[] objArr111 = new Object[1];
            i(bArr28[132], bArr28[10], (byte) 52, objArr111);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cRgb, iIndexOf14, i165, -976899241, false, (String) objArr111[0], null);
        }
        if (j6 == ((jLongValue14 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                char offsetBefore3 = (char) (TextUtils.getOffsetBefore("", 0) + 37567);
                int offsetBefore4 = 625 - TextUtils.getOffsetBefore("", 0);
                int i166 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13;
                Object[] objArr112 = new Object[1];
                i((short) 51, $$g[10], (byte) 52, objArr112);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(offsetBefore3, offsetBefore4, i166, -973632554, false, (String) objArr112[0], null);
            }
            Object[] objArr113 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).get(null);
            int i167 = ((int[]) objArr113[2])[0];
            int i168 = ((int[]) objArr113[0])[0];
            String[] strArr12 = (String[]) objArr113[3];
            int[] iArr7 = {i167};
            int length2 = ((Context) Class.forName(str6).getMethod(str15, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.alfamart_instruction_done_step3).substring(1, 7).length() + 282427753;
            int i169 = ~length2;
            int i170 = (-1675095352) + (((~((-92216074) | i169)) | 87296265 | (~((-1731522048) | i169))) * (-1136)) + (((~((-92216074) | length2)) | (~((-1731522048) | length2)) | (~(1736441855 | i169))) * (-568)) + (((~(length2 | (-87296266))) | (~(i169 | 1731522047)) | (~(92216073 | i169))) * 568) + 2034642987;
            int i171 = (i170 << 13) ^ i170;
            int i172 = i171 ^ (i171 >>> 17);
            ((int[]) objArr9[1])[0] = i172 ^ (i172 << 5);
            objArr9 = new Object[]{new int[]{i168}, new int[1], iArr7, strArr12};
            c = 0;
            str5 = str13;
        } else {
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                str5 = str13;
                baseContext5 = (Context) Class.forName(str12).getMethod(str5, new Class[0]).invoke(null, null);
            } else {
                str5 = str13;
            }
            if (baseContext5 != null) {
                baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
            }
            int iIntValue3 = ((Integer) Class.forName(str10).getMethod(str3, Object.class).invoke(null, this)).intValue();
            Object[] objArr114 = new Object[1];
            j(((Context) Class.forName(str6).getMethod(str15, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 162510572, 960543249 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) (((Context) Class.forName(str6).getMethod(str15, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111), (-57) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (((Context) Class.forName(str6).getMethod(str15, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr114);
            String str19 = (String) objArr114[0];
            Object[] objArr115 = new Object[1];
            j(((Context) Class.forName(str6).getMethod(str15, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_review_screen_backend_error_message_1064).substring(0, 61).length() - 162510533, ((Context) Class.forName(str6).getMethod(str15, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 960543261, (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ((Context) Class.forName(str6).getMethod(str15, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 68, (byte) (((Context) Class.forName(str6).getMethod(str15, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr115);
            Object[] objArr116 = {baseContext5, new String[]{str19, (String) objArr115[0]}, Integer.valueOf(iIntValue3), 17, 2034642987};
            byte[] bArr29 = $$m;
            Object[] objArr117 = new Object[1];
            k(bArr29[16], bArr29[164], bArr29[6], objArr117);
            Class<?> cls6 = Class.forName((String) objArr117[0]);
            Object[] objArr118 = new Object[1];
            k(bArr29[4], (byte) (-bArr29[256]), bArr29[111], objArr118);
            Object[] objArr119 = (Object[]) cls6.getMethod((String) objArr118[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr116);
            int i173 = ((int[]) objArr119[0])[0];
            int i174 = ((int[]) objArr119[2])[0];
            if (baseContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    char cIndexOf7 = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int i175 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 625;
                    int iIndexOf15 = TextUtils.indexOf((CharSequence) "", '0') + 15;
                    Object[] objArr120 = new Object[1];
                    i((short) 51, $$g[10], (byte) 52, objArr120);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cIndexOf7, i175, iIndexOf15, -973632554, false, (String) objArr120[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, objArr119);
                try {
                    long jLongValue15 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue15);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                        char gidForName3 = (char) (Process.getGidForName("") + 37568);
                        int jumpTapTimeout = 625 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i176 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14;
                        byte[] bArr30 = $$g;
                        Object[] objArr121 = new Object[1];
                        i(bArr30[132], bArr30[10], (byte) 52, objArr121);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(gidForName3, jumpTapTimeout, i176, -976899241, false, (String) objArr121[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue15 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                        char defaultSize = (char) (View.getDefaultSize(0, 0) + 37567);
                        int capsMode3 = 625 - TextUtils.getCapsMode("", 0, 0);
                        int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 14;
                        short s18 = (short) 103;
                        Object[] objArr122 = new Object[1];
                        i(s18, (byte) (s18 & 29), $$g[7], objArr122);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(defaultSize, capsMode3, threadPriority2, -477065106, false, (String) objArr122[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            } else {
                objArr119 = objArr119;
            }
            objArr9 = objArr119;
            c = 0;
        }
        if (((int[]) objArr9[2])[c] != ((int[]) objArr9[c])[c]) {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr13 = (String[]) objArr9[3];
            if (strArr13 != null) {
                for (String str20 : strArr13) {
                    arrayList6.add(str20);
                }
            }
            throw null;
        }
        Object[] objArr123 = new Object[4];
        int[] iArr8 = new int[1];
        objArr123[c] = iArr8;
        objArr123[1] = new int[1];
        int[] iArr9 = new int[1];
        objArr123[2] = iArr9;
        int i177 = ((int[]) objArr9[1])[c];
        int i178 = ((int[]) objArr9[2])[c];
        int i179 = ((int[]) objArr9[c])[c];
        String[] strArr14 = (String[]) objArr9[3];
        iArr9[c] = i178;
        iArr8[c] = i179;
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i180 = ~iMaxMemory;
        int i181 = i177 + 110309298 + (((~((-1642179947) | i180)) | 1629594720) * 98) + (((~(i180 | (-181558175))) | (-1642179947) | (~(181558174 | iMaxMemory))) * (-49)) + (((~(iMaxMemory | (-1642179947))) | (-1811152895)) * 49);
        int i182 = (i181 << 13) ^ i181;
        int i183 = i182 ^ (i182 >>> 17);
        ((int[]) objArr123[1])[0] = i183 ^ (i183 << 5);
        objArr123[3] = strArr14;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
            char edgeSlop4 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int iResolveSizeAndState = 2267 - View.resolveSizeAndState(0, 0, 0);
            int i184 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34;
            Object[] objArr124 = new Object[1];
            i((short) 51, $$g[10], (byte) 52, objArr124);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(edgeSlop4, iResolveSizeAndState, i184, -887667012, false, (String) objArr124[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char c12 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                int iMyTid5 = 2267 - (Process.myTid() >> 22);
                int maximumFlingVelocity4 = 33 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte[] bArr31 = $$g;
                Object[] objArr125 = new Object[1];
                i((short) 103, bArr31[10], (byte) (bArr31[208] - 1), objArr125);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(c12, iMyTid5, maximumFlingVelocity4, -654680577, false, (String) objArr125[0], null);
            }
            Object[] objArr126 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).get(null);
            objArr10 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i185 = ((int[]) objArr126[0])[0];
            int i186 = ((int[]) objArr126[3])[0];
            String[] strArr15 = (String[]) objArr126[1];
            int i187 = ((Context) Class.forName(str6).getMethod(str15, new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i188 = (((975493880 + (((~((-1027889785) | i187)) | 809762920) * 345)) + (((~((-1027889785) | (~i187))) | (-1028939389)) * 345)) + ((~(i187 | (-809762921))) * 345)) - 1865942340;
            int i189 = (i188 << 13) ^ i188;
            int i190 = i189 ^ (i189 >>> 17);
            ((int[]) objArr10[2])[0] = i190 ^ (i190 << 5);
        } else {
            Context baseContext6 = getBaseContext();
            if (baseContext6 == null) {
                baseContext6 = (Context) Class.forName(str12).getMethod(str5, new Class[0]).invoke(null, null);
            }
            if (baseContext6 != null) {
                baseContext6 = ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) ? null : baseContext6.getApplicationContext();
            }
            Object[] objArr127 = {baseContext6, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str3, Object.class).invoke(null, this)).intValue()), 0, -1865942340};
            byte[] bArr32 = $$m;
            byte b9 = bArr32[4];
            Object[] objArr128 = new Object[1];
            k(b9, bArr32[219], b9, objArr128);
            Class<?> cls7 = Class.forName((String) objArr128[0]);
            byte b10 = bArr32[273];
            Object[] objArr129 = new Object[1];
            k((short) 262, b10, (byte) (b10 | 8), objArr129);
            objArr10 = (Object[]) cls7.getMethod((String) objArr129[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr127);
            if (baseContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                    char longPressTimeout4 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iResolveSize3 = 2267 - View.resolveSize(0, 0);
                    int capsMode4 = TextUtils.getCapsMode("", 0, 0) + 33;
                    byte[] bArr33 = $$g;
                    Object[] objArr130 = new Object[1];
                    i((short) 103, bArr33[10], (byte) (bArr33[208] - 1), objArr130);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(longPressTimeout4, iResolveSize3, capsMode4, -654680577, false, (String) objArr130[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, objArr10);
                try {
                    long jLongValue16 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue16);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                        char c13 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int deadChar4 = 2267 - KeyEvent.getDeadChar(0, 0);
                        int iGreen2 = 33 - Color.green(0);
                        byte[] bArr34 = $$g;
                        Object[] objArr131 = new Object[1];
                        i(bArr34[132], bArr34[10], (byte) 52, objArr131);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(c13, deadChar4, iGreen2, -874156483, false, (String) objArr131[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                        char offsetBefore5 = (char) TextUtils.getOffsetBefore("", 0);
                        int touchSlop3 = (ViewConfiguration.getTouchSlop() >> 8) + 2267;
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 33;
                        Object[] objArr132 = new Object[1];
                        i((short) 51, $$g[10], (byte) 52, objArr132);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(offsetBefore5, touchSlop3, iMakeMeasureSpec, -887667012, false, (String) objArr132[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf20);
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            }
        }
        int i191 = ((int[]) objArr10[3])[0];
        int i192 = ((int[]) objArr10[0])[0];
        if (i192 == i191) {
            int i193 = asInterface + 81;
            asBinder = i193 % 128;
            int i194 = i193 % 2;
            Object[] objArr133 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i195 = ((int[]) objArr10[2])[0];
            int i196 = ((int[]) objArr10[0])[0];
            int i197 = ((int[]) objArr10[3])[0];
            String[] strArr16 = (String[]) objArr10[1];
            int i198 = ~System.identityHashCode(this);
            int i199 = i195 + 344890574 + (((~((-596612339) | i198)) | (-212100978)) * (-983)) + (((~(i198 | (-212100978))) | 203449089) * 983);
            int i200 = (i199 << 13) ^ i199;
            int i201 = i200 ^ (i200 >>> 17);
            ((int[]) objArr133[2])[0] = i201 ^ (i201 << 5);
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr17 = (String[]) objArr10[1];
            if (strArr17 != null) {
                for (String str21 : strArr17) {
                    arrayList7.add(str21);
                }
            }
            Toast.makeText((Context) null, i192 / (((i192 - 1) * i192) % 2), 0).show();
            Object[] objArr134 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i202 = ((int[]) objArr10[2])[0];
            int i203 = ((int[]) objArr10[0])[0];
            int i204 = ((int[]) objArr10[3])[0];
            String[] strArr18 = (String[]) objArr10[1];
            int i205 = ((Context) Class.forName(str6).getMethod(str15, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i206 = i202 + (((1611372062 + (((-235045635) | i205) * (-381))) + (((~((~i205) | (-248417027))) | 835456100) * 381)) - 641926662);
            int i207 = (i206 << 13) ^ i206;
            int i208 = i207 ^ (i207 >>> 17);
            ((int[]) objArr134[2])[0] = i208 ^ (i208 << 5);
        }
        super.onCreate();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
            char trimmedLength3 = (char) (29944 - TextUtils.getTrimmedLength(""));
            int doubleTapTimeout7 = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int i209 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            byte[] bArr35 = $$g;
            Object[] objArr135 = new Object[1];
            i((short) 103, bArr35[10], (byte) (bArr35[208] - 1), objArr135);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(trimmedLength3, doubleTapTimeout7, i209, 986134021, false, (String) objArr135[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                char capsMode5 = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
                int packedPositionGroup2 = 1755 - ExpandableListView.getPackedPositionGroup(0L);
                int threadPriority3 = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                Object[] objArr136 = new Object[1];
                i((short) 51, $$g[10], (byte) 52, objArr136);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(capsMode5, packedPositionGroup2, threadPriority3, 1599039318, false, (String) objArr136[0], null);
            }
            Object[] objArr137 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).get(null);
            objArr11 = new Object[]{new int[]{((int[]) objArr137[0])[0]}, new int[]{((int[]) objArr137[1])[0]}, (Object[]) objArr137[2], new int[1], (String[]) objArr137[4]};
            int i210 = ((Context) Class.forName(str6).getMethod(str15, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i211 = (((((~(1020573663 | i210)) | 805347585) * 449) + 1536018583) + (((~((~i210) | 1020573663)) | 805347585) * 449)) - 955676797;
            int i212 = (i211 << 13) ^ i211;
            int i213 = i212 ^ (i212 >>> 17);
            ((int[]) objArr11[3])[0] = i213 ^ (i213 << 5);
        } else {
            int iIntValue4 = ((Integer) Class.forName(str10).getMethod(str3, Object.class).invoke(null, this)).intValue();
            Object[] objArr138 = {-1142694176};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b((char) ((Process.myTid() >> 22) + 42049), (ViewConfiguration.getTouchSlop() >> 8) + 1726, 29 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue4, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).newInstance(objArr138), -955676797, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                char c14 = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int touchSlop4 = (ViewConfiguration.getTouchSlop() >> 8) + 1755;
                int iRgb3 = (-16777193) - Color.rgb(0, 0, 0);
                Object[] objArr139 = new Object[1];
                i((short) 51, $$g[10], (byte) 52, objArr139);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(c14, touchSlop4, iRgb3, 1599039318, false, (String) objArr139[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                long jLongValue17 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf21 = Long.valueOf(jLongValue17);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                    char doubleTapTimeout8 = (char) (29944 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    int iIndexOf16 = 1755 - TextUtils.indexOf("", "", 0, 0);
                    int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 23;
                    Object[] objArr140 = new Object[1];
                    i((short) 140, $$g[10], (byte) 52, objArr140);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(doubleTapTimeout8, iIndexOf16, offsetAfter2, 1596667560, false, (String) objArr140[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                    char cIndexOf8 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int modifierMetaStateMask2 = 1754 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23;
                    byte[] bArr36 = $$g;
                    Object[] objArr141 = new Object[1];
                    i((short) 103, bArr36[10], (byte) (bArr36[208] - 1), objArr141);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cIndexOf8, modifierMetaStateMask2, minimumFlingVelocity, 986134021, false, (String) objArr141[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                objArr11 = objArrTuitionPaymentFragmentbindingInflater1$7879113;
            } catch (Exception unused11) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr11[0])[0] != ((int[]) objArr11[1])[0]) {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr19 = (String[]) objArr11[4];
            if (strArr19 != null) {
                for (String str22 : strArr19) {
                    arrayList8.add(str22);
                }
            }
            throw null;
        }
        int i214 = ((int[]) objArr11[3])[0];
        Object[] objArr142 = {new int[]{((int[]) objArr11[0])[0]}, new int[]{((int[]) objArr11[1])[0]}, (Object[]) objArr11[2], new int[1], (String[]) objArr11[4]};
        int i215 = ((Context) Class.forName(str6).getMethod(str15, new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        int i216 = ~i215;
        int i217 = i214 + (-1144866607) + (((~(692522204 | i216)) | 347083522) * 168) + ((~((-347083523) | i215)) * 168) + (((~(i215 | 1039605726)) | (~(i216 | (-905124631))) | 558041108) * 168);
        int i218 = (i217 << 13) ^ i217;
        int i219 = i218 ^ (i218 >>> 17);
        ((int[]) objArr142[3])[0] = i219 ^ (i219 << 5);
    }

    public void onDeletedMessages() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
    }

    @Deprecated
    public void onMessageSent(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
    }

    public void onNewToken(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated
    public void onSendError(String str, Exception exc) {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -2063406113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795554;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1242700484;
        b = new byte[]{56, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 49, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, 62, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, 62, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29, 4, -27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 60, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, -18, -42, 42, -30, -26, -56, 26, 25, 49, -42, 28, -30, 53, -49, -18, 41, -54, -28, 40, 25, -56, -30, 25, 41, -29, -49, -31, -26, 30, -31, 55, -50, -26, -29, 54, -41, -28, 41, -51, 52, -27, -51, -26, -28, 54, -55, -29, 28, -28, 50, 26, -26, -42, 41, -26, -53, -27, 54, -30, -25, -26, 29, -25, -43, -18, -42, -32, 41, -53, -28, 42, -27, -41, 25, 25, 52, -49, -26, 48, -52, -32, -26, 25, 27, -25, 54, -25, -43, -26, 55, 26, -41, -27, 26, 53, -49, -25, 25, -26, -32, 28, 49, -56, 52, -54, 54, -55, -28, -28, 27, -27, -25, 24, 40, -46, 43, -27, -44, 44, -25, -56, 51, -53, -29, 28, 52, -27, 24};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$s(byte r6, short r7, byte r8) {
        /*
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r7 = r7 + 117
            byte[] r0 = com.google.firebase.messaging.FirebaseMessagingService.$$q
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r8 = r8 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.$$s(byte, short, byte):java.lang.String");
    }
}
