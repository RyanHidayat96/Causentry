package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.internal.zzmr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaf extends DefaultItemAnimator {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();
    private final int zzd;

    public zzaf(Resources resources) {
        this.zzd = resources.getDimensionPixelSize(R.dimen.places_autocomplete_vertical_dropdown);
    }

    private final void zzd(RecyclerView.ViewHolder viewHolder) {
        List list = this.zzc;
        View view = viewHolder.itemView;
        list.add(viewHolder);
        long moveDuration = getMoveDuration();
        long layoutPosition = viewHolder.getLayoutPosition();
        view.setTranslationY(-this.zzd);
        view.setAlpha(0.0f);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        viewPropertyAnimatorAnimate.cancel();
        viewPropertyAnimatorAnimate.translationY(0.0f).alpha(1.0f).setDuration(133L).setInterpolator(new FastOutSlowInInterpolator()).setStartDelay(moveDuration + (layoutPosition * 67));
        viewPropertyAnimatorAnimate.setListener(new zzae(this, view, viewHolder, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zza() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzf(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        try {
            endAnimation(viewHolder);
            viewHolder.itemView.setAlpha(0.0f);
            if (viewHolder instanceof zzak) {
                if (((zzak) viewHolder).zzb()) {
                    this.zza.add(viewHolder);
                    return true;
                }
                this.zzb.add(viewHolder);
                return true;
            }
            if (((zzq) viewHolder).zzb()) {
                this.zza.add(viewHolder);
                return true;
            }
            this.zzb.add(viewHolder);
            return true;
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void endAnimation(RecyclerView.ViewHolder viewHolder) {
        try {
            super.endAnimation(viewHolder);
            if (this.zza.remove(viewHolder)) {
                zzf(viewHolder.itemView);
                dispatchAddFinished(viewHolder);
            }
            zza();
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void endAnimations() {
        try {
            List list = this.zza;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) list.get(size);
                zzf(viewHolder.itemView);
                dispatchAddFinished(viewHolder);
                list.remove(size);
            }
            List list2 = this.zzc;
            int size2 = list2.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    super.endAnimations();
                    return;
                }
                ((RecyclerView.ViewHolder) list2.get(size2)).itemView.animate().cancel();
            }
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean isRunning() {
        try {
            return (!super.isRunning() && this.zzb.isEmpty() && this.zza.isEmpty() && this.zzc.isEmpty()) ? false : true;
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void runPendingAnimations() {
        try {
            List list = this.zzb;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                super.animateAdd((RecyclerView.ViewHolder) it.next());
            }
            list.clear();
            super.runPendingAnimations();
            List list2 = this.zza;
            if (list2.isEmpty()) {
                return;
            }
            ArrayList<RecyclerView.ViewHolder> arrayList = new ArrayList(list2);
            list2.clear();
            for (RecyclerView.ViewHolder viewHolder : arrayList) {
                View view = viewHolder.itemView;
                this.zzc.add(viewHolder);
                long moveDuration = getMoveDuration();
                long layoutPosition = viewHolder.getLayoutPosition();
                view.setTranslationY(-this.zzd);
                view.setAlpha(0.0f);
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                viewPropertyAnimatorAnimate.cancel();
                viewPropertyAnimatorAnimate.translationY(0.0f).alpha(1.0f).setDuration(133L).setInterpolator(new FastOutSlowInInterpolator()).setStartDelay(moveDuration + (layoutPosition * 67));
                viewPropertyAnimatorAnimate.setListener(new zzae(this, view, viewHolder, viewPropertyAnimatorAnimate)).start();
            }
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    final /* synthetic */ List zzc() {
        return this.zzc;
    }
}
