package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.zzmr;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzae extends AnimatorListenerAdapter {
    final /* synthetic */ View zza;
    final /* synthetic */ RecyclerView.ViewHolder zzb;
    final /* synthetic */ ViewPropertyAnimator zzc;
    final /* synthetic */ zzaf zzd;

    zzae(zzaf zzafVar, View view, RecyclerView.ViewHolder viewHolder, ViewPropertyAnimator viewPropertyAnimator) {
        this.zza = view;
        this.zzb = viewHolder;
        this.zzc = viewPropertyAnimator;
        Objects.requireNonNull(zzafVar);
        this.zzd = zzafVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        try {
            ViewPropertyAnimator viewPropertyAnimator = this.zzc;
            viewPropertyAnimator.setListener(null);
            zzaf zzafVar = this.zzd;
            RecyclerView.ViewHolder viewHolder = this.zzb;
            zzafVar.dispatchAddFinished(viewHolder);
            zzafVar.zzc().remove(viewHolder);
            zzafVar.zza();
            viewPropertyAnimator.setStartDelay(0L);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        try {
            zzaf.zzf(this.zza);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        try {
            this.zza.setAlpha(0.0f);
            this.zzd.dispatchAddStarting(this.zzb);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }
}
