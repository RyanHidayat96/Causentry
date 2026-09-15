package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.intercept.EngineInterceptor$intercept$1;
import coil.intercept.EngineInterceptor$intercept$2;
import coil.intercept.EngineInterceptor$transform$3;
import coil.memory.MemoryCache;
import coil.size.Scale;
import com.google.android.gms.internal.mlkit_vision_face.zzbr;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0002\u001d\u000eB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u0015\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u001aJ@\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0013H\u0081@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010%\u001a\u00020'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010("}, d2 = {"LnewInstance;", "LfromParcel;", "LwriteToParcel;", "p0", "Lpause;", "p1", "LRatingCompatStarStyle;", "p2", "LgetVolumeAttributes;", "p3", "<init>", "(LwriteToParcel;Lpause;LRatingCompatStarStyle;LgetVolumeAttributes;)V", "LfromParcel$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "LnewStarRating;", "TuitionPaymentFragmentbindingInflater1", "(LfromParcel$TuitionPaymentFragmentspecialinlinedviewModeldefault2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LnewUnratedRating;", "", "LgetStarRating;", "LgetMediaId;", "LnewInstance$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(LnewUnratedRating;Ljava/lang/Object;LgetStarRating;LgetMediaId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LgetFlags;", "p4", "LsetMediaUri;", "(LgetFlags;LnewUnratedRating;Ljava/lang/Object;LgetStarRating;LgetMediaId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LMediaDescriptionCompatApi21Builder;", "p5", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LMediaDescriptionCompatApi21Builder;LgetFlags;LnewUnratedRating;Ljava/lang/Object;LgetStarRating;LgetMediaId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(LnewInstance$TuitionPaymentFragmentspecialinlinedviewModeldefault1;LnewUnratedRating;LgetStarRating;LgetMediaId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LwriteToParcel;", "d", "Lpause;", "LRatingCompatStarStyle;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LgetVolumeAttributes;", "LMediaMetadataCompatBitmapKey;", "LMediaMetadataCompatBitmapKey;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class newInstance implements fromParcel {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final MediaMetadataCompatBitmapKey TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final getVolumeAttributes TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final RatingCompatStarStyle b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final writeToParcel TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final pause TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public newInstance(writeToParcel writetoparcel, pause pauseVar, RatingCompatStarStyle ratingCompatStarStyle, getVolumeAttributes getvolumeattributes) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = writetoparcel;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = pauseVar;
        this.b = ratingCompatStarStyle;
        this.TuitionPaymentFragmentbindingInflater1 = getvolumeattributes;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new MediaMetadataCompatBitmapKey(writetoparcel, ratingCompatStarStyle, getvolumeattributes);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // defpackage.fromParcel
    public final Object TuitionPaymentFragmentbindingInflater1(fromParcel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, Continuation<? super newStarRating> continuation) throws Throwable {
        EngineInterceptor$intercept$1 engineInterceptor$intercept$1;
        newInstance newinstance;
        if (continuation instanceof EngineInterceptor$intercept$1) {
            engineInterceptor$intercept$1 = (EngineInterceptor$intercept$1) continuation;
            if ((engineInterceptor$intercept$1.label & Integer.MIN_VALUE) != 0) {
                engineInterceptor$intercept$1.label -= Integer.MIN_VALUE;
            } else {
                engineInterceptor$intercept$1 = new EngineInterceptor$intercept$1(this, continuation);
            }
        } else {
            engineInterceptor$intercept$1 = new EngineInterceptor$intercept$1(this, continuation);
        }
        Object obj = engineInterceptor$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = engineInterceptor$intercept$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                newUnratedRating f178a = tuitionPaymentFragmentspecialinlinedviewModeldefault2.getF178a();
                Object onTransact = f178a.getOnTransact();
                onQueueTitleChanged asBinder = tuitionPaymentFragmentspecialinlinedviewModeldefault2.getAsBinder();
                getMediaId getmediaidTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
                getStarRating getstarratingB = this.b.b(f178a, asBinder);
                Scale scaleCancelAll = getstarratingB.cancelAll();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getCancel().TuitionPaymentFragmentspecialinlinedviewModeldefault3(onTransact, getstarratingB);
                MemoryCache.Key keyTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(f178a, objTuitionPaymentFragmentspecialinlinedviewModeldefault3, getstarratingB);
                MemoryCache.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1B = keyTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(f178a, keyTuitionPaymentFragmentspecialinlinedviewModeldefault3, asBinder, scaleCancelAll) : null;
                if (tuitionPaymentFragmentbindingInflater1B != null) {
                    return MediaMetadataCompatBitmapKey.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault2, f178a, keyTuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentbindingInflater1B);
                }
                CoroutineDispatcher getInterfaceDescriptor = f178a.getGetInterfaceDescriptor();
                EngineInterceptor$intercept$2 engineInterceptor$intercept$2 = new EngineInterceptor$intercept$2(this, f178a, objTuitionPaymentFragmentspecialinlinedviewModeldefault3, getstarratingB, getmediaidTuitionPaymentFragmentspecialinlinedviewModeldefault2, keyTuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault2, null);
                engineInterceptor$intercept$1.L$0 = this;
                engineInterceptor$intercept$1.L$1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
                engineInterceptor$intercept$1.label = 1;
                Object objTuitionPaymentFragmentbindingInflater1 = BuildersKt.TuitionPaymentFragmentbindingInflater1(getInterfaceDescriptor, engineInterceptor$intercept$2, engineInterceptor$intercept$1);
                return objTuitionPaymentFragmentbindingInflater1 == coroutine_suspended ? coroutine_suspended : objTuitionPaymentFragmentbindingInflater1;
            } catch (Throwable th) {
                th = th;
                newinstance = this;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (fromParcel.TuitionPaymentFragmentspecialinlinedviewModeldefault2) engineInterceptor$intercept$1.L$1;
            newinstance = (newInstance) engineInterceptor$intercept$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        RatingCompatStarStyle ratingCompatStarStyle = newinstance.b;
        return RatingCompatStarStyle.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault2.getF178a(), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:56:0x018e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0191  */
    /* JADX WARN: Code duplicated, block: B:59:0x0194  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f1  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01bc, code lost:
    
        if (r1 == r9) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r18v0, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, getStarRating] */
    /* JADX WARN: Type inference failed for: r1v16, types: [T, getFlags] */
    /* JADX WARN: Type inference failed for: r1v22, types: [T] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, getFlags] */
    /* JADX WARN: Type inference failed for: r29v0, types: [T, getStarRating] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r3v11, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(defpackage.newUnratedRating r27, java.lang.Object r28, defpackage.getStarRating r29, defpackage.getMediaId r30, kotlin.coroutines.Continuation<? super newInstance.TuitionPaymentFragmentspecialinlinedviewModeldefault1> r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.newInstance.TuitionPaymentFragmentspecialinlinedviewModeldefault3(newUnratedRating, java.lang.Object, getStarRating, getMediaId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:19:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x008f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008f -> B:21:0x0093). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(defpackage.getFlags r9, defpackage.newUnratedRating r10, java.lang.Object r11, defpackage.getStarRating r12, defpackage.getMediaId r13, kotlin.coroutines.Continuation<? super defpackage.setMediaUri> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof coil.intercept.EngineInterceptor$fetch$1
            if (r0 == 0) goto L14
            r0 = r14
            coil.intercept.EngineInterceptor$fetch$1 r0 = (coil.intercept.EngineInterceptor$fetch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.label
            int r14 = r14 + r2
            r0.label = r14
            goto L19
        L14:
            coil.intercept.EngineInterceptor$fetch$1 r0 = new coil.intercept.EngineInterceptor$fetch$1
            r0.<init>(r8, r14)
        L19:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L58
            if (r2 != r3) goto L50
            int r9 = r0.I$0
            java.lang.Object r10 = r0.L$6
            setMediaId r10 = (defpackage.setMediaId) r10
            java.lang.Object r10 = r0.L$5
            getMediaId r10 = (defpackage.getMediaId) r10
            java.lang.Object r11 = r0.L$4
            getStarRating r11 = (defpackage.getStarRating) r11
            java.lang.Object r12 = r0.L$3
            java.lang.Object r13 = r0.L$2
            newUnratedRating r13 = (defpackage.newUnratedRating) r13
            java.lang.Object r2 = r0.L$1
            getFlags r2 = (defpackage.getFlags) r2
            java.lang.Object r4 = r0.L$0
            newInstance r4 = (defpackage.newInstance) r4
            kotlin.ResultKt.throwOnFailure(r14)
            r5 = r0
            r0 = r9
            r9 = r2
            r2 = r5
            r6 = r13
            r13 = r10
            r10 = r6
            r7 = r12
            r12 = r11
            r11 = r7
            goto L93
        L50:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L58:
            kotlin.ResultKt.throwOnFailure(r14)
            r14 = 0
            r4 = r8
        L5d:
            writeToParcel r2 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            kotlin.Pair r14 = r9.b(r11, r12, r2, r14)
            if (r14 == 0) goto L9b
            java.lang.Object r2 = r14.getFirst()
            setMediaId r2 = (defpackage.setMediaId) r2
            java.lang.Object r14 = r14.getSecond()
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            int r14 = r14 + r3
            r0.L$0 = r4
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r11
            r0.L$4 = r12
            r0.L$5 = r13
            r0.L$6 = r2
            r0.I$0 = r14
            r0.label = r3
            java.lang.Object r2 = r2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r0)
            if (r2 != r1) goto L8f
            return r1
        L8f:
            r5 = r0
            r0 = r14
            r14 = r2
            r2 = r5
        L93:
            setMediaUri r14 = (defpackage.setMediaUri) r14
            if (r14 == 0) goto L98
            return r14
        L98:
            r14 = r0
            r0 = r2
            goto L5d
        L9b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Unable to create a fetcher that supports: "
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r10 = r10.concat(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.newInstance.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getFlags, newUnratedRating, java.lang.Object, getStarRating, getMediaId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    /* JADX WARN: Code duplicated, block: B:19:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0095  */
    /* JADX WARN: Code duplicated, block: B:23:0x009d  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0095 -> B:21:0x0099). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(defpackage.MediaDescriptionCompatApi21Builder r9, defpackage.getFlags r10, defpackage.newUnratedRating r11, java.lang.Object r12, defpackage.getStarRating r13, defpackage.getMediaId r14, kotlin.coroutines.Continuation<? super newInstance.TuitionPaymentFragmentspecialinlinedviewModeldefault1> r15) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.newInstance.TuitionPaymentFragmentspecialinlinedviewModeldefault1(MediaDescriptionCompatApi21Builder, getFlags, newUnratedRating, java.lang.Object, getStarRating, getMediaId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private Object b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, newUnratedRating newunratedrating, getStarRating getstarrating, getMediaId getmediaid, Continuation<? super TuitionPaymentFragmentspecialinlinedviewModeldefault1> continuation) {
        List<IMediaControllerCallbackStub> listSendCustomAction = newunratedrating.sendCustomAction();
        if (listSendCustomAction.isEmpty()) {
            return tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        if (!(tuitionPaymentFragmentspecialinlinedviewModeldefault1.getTuitionPaymentFragmentspecialinlinedviewModeldefault1() instanceof BitmapDrawable) && !newunratedrating.getG()) {
            getVolumeAttributes getvolumeattributes = this.TuitionPaymentFragmentbindingInflater1;
            if (getvolumeattributes == null || getvolumeattributes.TuitionPaymentFragmentbindingInflater1() > 4) {
                return tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.getTuitionPaymentFragmentspecialinlinedviewModeldefault1().getClass().getCanonicalName();
            return tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        return BuildersKt.TuitionPaymentFragmentbindingInflater1(newunratedrating.asInterface, new EngineInterceptor$transform$3(this, tuitionPaymentFragmentspecialinlinedviewModeldefault1, getstarrating, listSendCustomAction, getmediaid, newunratedrating, null), continuation);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\f\u0010\u0016R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018"}, d2 = {"LnewInstance$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "Landroid/graphics/drawable/Drawable;", "p0", "", "p1", "Lcoil/decode/DataSource;", "p2", "", "p3", "<init>", "(Landroid/graphics/drawable/Drawable;ZLcoil/decode/DataSource;Ljava/lang/String;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Landroid/graphics/drawable/Drawable;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Landroid/graphics/drawable/Drawable;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "Z", "()Z", "b", "Lcoil/decode/DataSource;", "()Lcoil/decode/DataSource;", "Ljava/lang/String;", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        private final Drawable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final DataSource b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(Drawable drawable, boolean z, DataSource dataSource, String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = drawable;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
            this.b = dataSource;
            this.TuitionPaymentFragmentbindingInflater1 = str;
        }

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from getter */
        public final Drawable getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from getter */
        public final boolean getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
        public final DataSource getB() {
            return this.b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTuitionPaymentFragmentbindingInflater1() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        public static /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1 b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, Drawable drawable) {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(drawable, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault1.b, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
        }
    }

    public static final /* synthetic */ Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault1(newInstance newinstance, Drawable drawable, getStarRating getstarrating, List list) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config configTuitionPaymentFragmentspecialinlinedviewModeldefault1 = fastForward.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bitmap);
            if (ArraysKt.contains(getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), configTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return bitmap;
            }
            getVolumeAttributes getvolumeattributes = newinstance.TuitionPaymentFragmentbindingInflater1;
            if (getvolumeattributes != null && getvolumeattributes.TuitionPaymentFragmentbindingInflater1() <= 4) {
                Objects.toString(configTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                Objects.toString(list);
            }
        } else {
            getVolumeAttributes getvolumeattributes2 = newinstance.TuitionPaymentFragmentbindingInflater1;
            if (getvolumeattributes2 != null && getvolumeattributes2.TuitionPaymentFragmentbindingInflater1() <= 4) {
                drawable.getClass().getCanonicalName();
                Objects.toString(list);
            }
        }
        getRepeatMode getrepeatmode = getRepeatMode.INSTANCE;
        Bitmap.Config configTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getstarrating.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        onQueueTitleChanged onqueuetitlechangedCancel = getstarrating.cancel();
        Scale scaleCancelAll = getstarrating.cancelAll();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return getRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(drawable, configTuitionPaymentFragmentspecialinlinedviewModeldefault3, onqueuetitlechangedCancel, scaleCancelAll, ((Boolean) getStarRating.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1007128350, zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1007128351, new Object[]{getstarrating}, iTuitionPaymentFragmentspecialinlinedviewModeldefault5)).booleanValue());
    }
}
