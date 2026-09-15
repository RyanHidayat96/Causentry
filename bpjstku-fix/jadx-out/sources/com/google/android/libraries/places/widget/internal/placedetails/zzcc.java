package com.google.android.libraries.places.widget.internal.placedetails;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.libraries.places.internal.zzor;
import com.google.android.libraries.places.internal.zzot;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
final class zzcc extends SuspendLambda implements Function2 {
    public static final /* synthetic */ int zzf = 0;
    int zza;
    final /* synthetic */ zzcd zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzca zzd;
    final /* synthetic */ Drawable zze;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcc) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzor zzorVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0 && (zzorVar = this.zzb.zze) != null) {
            String str = this.zzc;
            final zzca zzcaVar = this.zzd;
            final Drawable drawable = this.zze;
            this.zza = 1;
            if (zzorVar.zza(Uri.parse(str), new zzot(zzcaVar.zzb(), new Function1() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzcb
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Object obj2) {
                    zzcaVar.zzb().setImageDrawable(drawable);
                    return Unit.INSTANCE;
                }
            }), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcc(zzcd zzcdVar, String str, zzca zzcaVar, Drawable drawable, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzcdVar;
        this.zzc = str;
        this.zzd = zzcaVar;
        this.zze = drawable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzcc(this.zzb, this.zzc, this.zzd, this.zze, continuation);
    }
}
