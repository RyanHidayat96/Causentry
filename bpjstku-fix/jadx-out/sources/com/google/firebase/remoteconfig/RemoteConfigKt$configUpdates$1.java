package com.google.firebase.remoteconfig;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import defpackage.onEncodePaused;
import defpackage.setEncoderCallback;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/google/firebase/remoteconfig/ConfigUpdate;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1", f = "RemoteConfig.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
final class RemoteConfigKt$configUpdates$1 extends SuspendLambda implements Function2<onEncodePaused<? super ConfigUpdate>, Continuation<? super Unit>, Object> {
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            onEncodePaused onencodepaused = (onEncodePaused) this.L$0;
            final ConfigUpdateListenerRegistration configUpdateListenerRegistrationAddOnConfigUpdateListener = this.$this_configUpdates.addOnConfigUpdateListener(new RemoteConfigKt$configUpdates$1$registration$1(this.$this_configUpdates, onencodepaused));
            Intrinsics.checkNotNullExpressionValue(configUpdateListenerRegistrationAddOnConfigUpdateListener, "");
            this.label = 1;
            if (setEncoderCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onencodepaused, new Function0<Unit>() { // from class: com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1.1
                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ Unit invoke() throws IllegalAccessException {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.resolveSize(0, 0) + 46400), View.resolveSizeAndState(0, 0, 0) + 40, 18 - Process.getGidForName(""), 1513912262, false, "b", null);
                    }
                    int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-16739380) - Color.rgb(0, 0, 0)), TextUtils.indexOf("", "", 0, 0) + 59, TextUtils.indexOf("", "") + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
                    }
                    int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                    long j = i3;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37836), 59 - View.resolveSize(0, 0), 19 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
                    }
                    int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
                    long jIdentityHashCode = System.identityHashCode(this);
                    long j2 = -1;
                    long j3 = j2 ^ 3475539961748807488L;
                    long j4 = 676;
                    long j5 = jIdentityHashCode ^ j2;
                    long j6 = (((long) 677) * 2043713535410978751L) + (((long) (-675)) * 3475539961748807488L) + (((long) (-676)) * (jIdentityHashCode | 2043713535410978751L | j3)) + ((((j3 | 2043713535410978751L) ^ j2) | ((j5 | 2043713535410978751L) ^ j2)) * j4) + (j4 * (((4359409328754950143L | jIdentityHashCode) ^ j2) | (((2043713535410978751L ^ j2) | j3) ^ j2) | ((j3 | j5) ^ j2)));
                    int i5 = 0;
                    long j7 = j;
                    int i6 = i4;
                    while (true) {
                        for (int i7 = 0; i7 != 8; i7++) {
                            i6 = (((((int) (j7 >> i7)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                        }
                        if (i5 != 0) {
                            break;
                        }
                        i5++;
                        j7 = j6;
                    }
                    if (i6 != i2) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 40, 19 - (ViewConfiguration.getScrollBarSize() >> 8), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                        throw new RuntimeException(String.valueOf(i3));
                    }
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    configUpdateListenerRegistrationAddOnConfigUpdateListener.remove();
                }

                {
                    super(0);
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteConfigKt$configUpdates$1(FirebaseRemoteConfig firebaseRemoteConfig, Continuation<? super RemoteConfigKt$configUpdates$1> continuation) {
        super(2, continuation);
        this.$this_configUpdates = firebaseRemoteConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RemoteConfigKt$configUpdates$1 remoteConfigKt$configUpdates$1 = new RemoteConfigKt$configUpdates$1(this.$this_configUpdates, continuation);
        remoteConfigKt$configUpdates$1.L$0 = obj;
        return remoteConfigKt$configUpdates$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(onEncodePaused<? super ConfigUpdate> onencodepaused, Continuation<? super Unit> continuation) {
        return ((RemoteConfigKt$configUpdates$1) create(onencodepaused, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
