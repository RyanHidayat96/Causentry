package com.bpjstku.presentation.compose.common;

import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.ContextThemeWrapper;
import defpackage.FuturesExternalSyntheticLambda8;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.compose.common.UtilKt$handlePickedFile$2", f = "Util.kt", i = {}, l = {55, 64}, m = "invokeSuspend", n = {}, s = {})
public final class UtilKt$handlePickedFile$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
    final /* synthetic */ File $file;
    final /* synthetic */ String $mimeType;
    final /* synthetic */ Function1<String, Unit> $onWarning;
    int label;

    /* JADX WARN: Code duplicated, block: B:34:0x009a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        File fileB;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (StringsKt.startsWith$default(this.$mimeType, "image/", false, 2, (Object) null) && this.$file.length() > PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
                    fileB = ContextThemeWrapper.b(this.$file);
                } else {
                    fileB = this.$file;
                }
                if (StringsKt.startsWith$default(this.$mimeType, "image/", false, 2, (Object) null)) {
                    if (fileB.length() <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
                        return fileB;
                    }
                } else if (fileB.length() <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
                    return fileB;
                }
                this.label = 1;
                if (BuildersKt.TuitionPaymentFragmentbindingInflater1(Dispatchers.TuitionPaymentFragmentbindingInflater1(), new AnonymousClass1(this.$mimeType, this.$onWarning, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return null;
                }
                ResultKt.throwOnFailure(obj);
            }
            return null;
        } catch (Exception e2) {
            this.label = 2;
            if (BuildersKt.TuitionPaymentFragmentbindingInflater1(Dispatchers.TuitionPaymentFragmentbindingInflater1(), new AnonymousClass2(this.$onWarning, e2, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.compose.common.UtilKt$handlePickedFile$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.bpjstku.presentation.compose.common.UtilKt$handlePickedFile$2$1", f = "Util.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $mimeType;
        final /* synthetic */ Function1<String, Unit> $onWarning;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StringsKt.startsWith$default(this.$mimeType, "image/", false, 2, (Object) null);
            this.$onWarning.invoke("Ukuran file tidak boleh lebih dari 2 MB");
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(String str, Function1<? super String, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$mimeType = str;
            this.$onWarning = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$mimeType, this.$onWarning, continuation);
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            FuturesExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0] = Class.forName("AppCompatTextHelper1").getDeclaredField("b");
        }
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.compose.common.UtilKt$handlePickedFile$2$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.bpjstku.presentation.compose.common.UtilKt$handlePickedFile$2$2", f = "Util.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Exception $e;
        final /* synthetic */ Function1<String, Unit> $onWarning;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$onWarning.invoke("Gagal memproses file: ".concat(String.valueOf(this.$e.getMessage())));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super String, Unit> function1, Exception exc, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$onWarning = function1;
            this.$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$onWarning, this.$e, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        return ((UtilKt$handlePickedFile$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UtilKt$handlePickedFile$2(String str, File file, Function1<? super String, Unit> function1, Continuation<? super UtilKt$handlePickedFile$2> continuation) {
        super(2, continuation);
        this.$mimeType = str;
        this.$file = file;
        this.$onWarning = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtilKt$handlePickedFile$2(this.$mimeType, this.$file, this.$onWarning, continuation);
    }
}
