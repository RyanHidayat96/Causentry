package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemLoadMoreBinding;
import com.bpjstku.databinding.ItemNotificationBinding;
import com.bpjstku.domain.notification.model.Notification;
import com.bpjstku.util.enums.NotificationType;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001:\u0001\u0017B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015"}, d2 = {"LPackageIdentityUtils;", "LaddCaptureRequestOptionsInternal;", "Lcom/bpjstku/domain/notification/model/Notification;", "Lr8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "getItemViewType", "(I)I", "getItemCount", "()I", "Landroid/view/ViewGroup;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/view/ViewGroup;I)Lr8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470;", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentbindingInflater1", "b"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PackageIdentityUtils extends addCaptureRequestOptionsInternal<Notification, r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470<Notification>> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    final Function1<Notification, Unit> TuitionPaymentFragmentbindingInflater1;

    @Override // defpackage.addCaptureRequestOptionsInternal, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return onCreateViewHolder(viewGroup, i);
    }

    public /* synthetic */ PackageIdentityUtils(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private PackageIdentityUtils(Context context, List<Notification> list, Function1<? super Notification, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentbindingInflater1 = function1;
    }

    @Override // defpackage.addCaptureRequestOptionsInternal
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470<Notification> onCreateViewHolder(ViewGroup p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == 985213) {
            ItemNotificationBinding itemNotificationBindingInflate = ItemNotificationBinding.inflate(LayoutInflater.from(p0.getContext()), p0, false);
            Intrinsics.checkNotNullExpressionValue(itemNotificationBindingInflate, "");
            addCaptureRequestOptionsInternal.b bVar = this.d;
            addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.asBinder;
            return new b(this, itemNotificationBindingInflate, null, null);
        }
        if (p1 == 981923) {
            Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            ItemLoadMoreBinding itemLoadMoreBindingInflate = ItemLoadMoreBinding.inflate(LayoutInflater.from(p0.getContext()), p0, false);
            Intrinsics.checkNotNullExpressionValue(itemLoadMoreBindingInflate, "");
            addCaptureRequestOptionsInternal.b bVar2 = this.d;
            addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.asBinder;
            addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            Boolean boolTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Intrinsics.checkNotNullExpressionValue(boolTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            boolean zBooleanValue = boolTuitionPaymentFragmentspecialinlinedviewModeldefault3.booleanValue();
            Integer num = this.b;
            Intrinsics.checkNotNullExpressionValue(num, "");
            int iIntValue = num.intValue();
            Integer num2 = this.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNullExpressionValue(num2, "");
            return new updateConfig(context, itemLoadMoreBindingInflate, null, null, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2, zBooleanValue, iIntValue, num2.intValue());
        }
        throw new IllegalArgumentException("Invalid view type");
    }

    public final class b extends r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470<Notification> {
        private /* synthetic */ PackageIdentityUtils TuitionPaymentFragmentbindingInflater1;
        private final ItemNotificationBinding b;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(PackageIdentityUtils packageIdentityUtils, ItemNotificationBinding itemNotificationBinding, addCaptureRequestOptionsInternal.b bVar, addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            Intrinsics.checkNotNullParameter(itemNotificationBinding, "");
            this.TuitionPaymentFragmentbindingInflater1 = packageIdentityUtils;
            Context context = packageIdentityUtils.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Intrinsics.checkNotNullExpressionValue(context, "");
            ConstraintLayout root = itemNotificationBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.b = itemNotificationBinding;
        }

        @Override // defpackage.r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Notification notification) throws ParseException {
            AppCompatTextView appCompatTextView;
            Typeface typeface;
            final Notification notification2 = notification;
            ItemNotificationBinding itemNotificationBinding = this.b;
            final PackageIdentityUtils packageIdentityUtils = this.TuitionPaymentFragmentbindingInflater1;
            View view = this.itemView;
            if (notification2 != null) {
                if (!notification2.isRead) {
                    appCompatTextView = itemNotificationBinding.tvTitleNotification;
                    typeface = Typeface.DEFAULT_BOLD;
                } else {
                    appCompatTextView = itemNotificationBinding.tvTitleNotification;
                    typeface = Typeface.DEFAULT;
                }
                appCompatTextView.setTypeface(typeface);
                CharSequence charSequenceSubSequence = notification2.date.subSequence(10, 16);
                itemNotificationBinding.tvTitleNotification.setText(notification2.title);
                itemNotificationBinding.viewUnreadIndicator.setVisibility(notification2.isRead ? 4 : 0);
                AppCompatTextView appCompatTextView2 = itemNotificationBinding.tvNotificationTime;
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(notification2.date, "dd-MM-yyyy", "EEE, dd MMM yyyy");
                StringBuilder sb = new StringBuilder();
                sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                sb.append((Object) charSequenceSubSequence);
                sb.append(" WIB");
                appCompatTextView2.setText(sb.toString());
                String str = notification2.type;
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String upperCase = str.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                itemNotificationBinding.imgNotification.setImageResource((Intrinsics.areEqual(upperCase, NotificationType.INFORMATION.getType()) || !Intrinsics.areEqual(upperCase, NotificationType.APPROVED_CLAIM.getType())) ? R.drawable.ic_sample_notification : R.drawable.ic_notif_approved_claim);
                Intrinsics.checkNotNull(view);
                view.setOnClickListener(new isBound(new Function1() { // from class: getCertificateSHA256Fingerprint
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PackageIdentityUtils.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(packageIdentityUtils, notification2, this, (View) obj);
                    }
                }));
            }
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(PackageIdentityUtils packageIdentityUtils, Notification notification, b bVar, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1<Notification, Unit> function1 = packageIdentityUtils.TuitionPaymentFragmentbindingInflater1;
            if (function1 != null) {
                function1.invoke(notification);
            }
            if (!notification.isRead) {
                notification.isRead = true;
                packageIdentityUtils.notifyItemChanged(bVar.getAdapterPosition());
            }
            return Unit.INSTANCE;
        }
    }

    @Override // defpackage.addCaptureRequestOptionsInternal, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int p0) {
        List<Data> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNullExpressionValue(list, "");
        return CollectionsKt.getOrNull(list, p0) != null ? 985213 : 981923;
    }
}
