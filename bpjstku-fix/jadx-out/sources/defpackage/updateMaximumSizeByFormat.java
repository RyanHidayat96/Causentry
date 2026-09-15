package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemScholarProveFileBinding;
import com.bpjstku.domain.scholarship.model.ScholarDocument;
import com.bumptech.glide.Glide;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0011\u0012BK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR(\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R(\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"LupdateMaximumSizeByFormat;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/bpjstku/domain/scholarship/model/ScholarDocument;", "LupdateMaximumSizeByFormat$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Landroidx/fragment/app/FragmentActivity;", "p0", "Lkotlin/Function2;", "", "", "p1", "p2", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroidx/fragment/app/FragmentActivity;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function2;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class updateMaximumSizeByFormat extends ListAdapter<ScholarDocument, TuitionPaymentFragmentspecialinlinedviewModeldefault2> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function2<Integer, ScholarDocument, Unit> b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final FragmentActivity TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function2<Integer, ScholarDocument, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public /* synthetic */ updateMaximumSizeByFormat(FragmentActivity fragmentActivity, Function2 function2, Function2 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, (i & 2) != 0 ? null : function2, (i & 4) != 0 ? null : function3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) viewHolder;
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        ScholarDocument scholarDocument = getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(scholarDocument, "");
        final ScholarDocument scholarDocument2 = scholarDocument;
        Intrinsics.checkNotNullParameter(scholarDocument2, "");
        ItemScholarProveFileBinding itemScholarProveFileBinding = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final updateMaximumSizeByFormat updatemaximumsizebyformat = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ImageView imageView = itemScholarProveFileBinding.itemScholarProveIcon;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        TextView textView = itemScholarProveFileBinding.itemScholarProveFile;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        if (scholarDocument2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            ImageButton imageButton = itemScholarProveFileBinding.itemScholarProveEdit;
            Intrinsics.checkNotNullExpressionValue(imageButton, "");
            imageButton.setVisibility(8);
            ImageButton imageButton2 = itemScholarProveFileBinding.itemScholarProveDelete;
            Intrinsics.checkNotNullExpressionValue(imageButton2, "");
            imageButton2.setVisibility(8);
        } else {
            ImageButton imageButton3 = itemScholarProveFileBinding.itemScholarProveEdit;
            Intrinsics.checkNotNullExpressionValue(imageButton3, "");
            imageButton3.setVisibility(0);
            ImageButton imageButton4 = itemScholarProveFileBinding.itemScholarProveDelete;
            Intrinsics.checkNotNullExpressionValue(imageButton4, "");
            imageButton4.setVisibility(0);
        }
        itemScholarProveFileBinding.itemScholarProveTitle.setText(scholarDocument2.b);
        String str = scholarDocument2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (Intrinsics.areEqual(str, "D113") || Intrinsics.areEqual(str, "D114")) {
            TextView textView2 = itemScholarProveFileBinding.itemScholarProveTitle;
            String str2 = scholarDocument2.b;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" *");
            textView2.setText(sb.toString(), TextView.BufferType.SPANNABLE);
            CharSequence text = itemScholarProveFileBinding.itemScholarProveTitle.getText();
            Intrinsics.checkNotNull(text, "");
            int length = itemScholarProveFileBinding.itemScholarProveTitle.getText().length();
            ((Spannable) text).setSpan(new ForegroundColorSpan(SupportMenu.CATEGORY_MASK), length - 1, length, 17);
        }
        TextView textView3 = itemScholarProveFileBinding.itemScholarProveFile;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        TextView textView4 = textView3;
        Function1 function1 = new Function1() { // from class: isUseCasesCombinationSupported
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return updateMaximumSizeByFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(scholarDocument2, updatemaximumsizebyformat, i, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(textView4, "");
        Intrinsics.checkNotNullParameter(function1, "");
        textView4.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        ImageView imageView2 = itemScholarProveFileBinding.itemScholarProveIcon;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        ImageView imageView3 = imageView2;
        Function1 function2 = new Function1() { // from class: updateUltraMaximumSizeByFormat
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return updateMaximumSizeByFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, i, scholarDocument2, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(imageView3, "");
        Intrinsics.checkNotNullParameter(function2, "");
        imageView3.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function2));
        itemScholarProveFileBinding.itemScholarProveEdit.setOnClickListener(new View.OnClickListener() { // from class: getUpdatedSurfaceSizeDefinitionByFormat
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                updateMaximumSizeByFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, i, scholarDocument2, view);
            }
        });
        itemScholarProveFileBinding.itemScholarProveDelete.setOnClickListener(new View.OnClickListener() { // from class: applyResolutionSelectionOrderRelatedWorkarounds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                updateMaximumSizeByFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, i, scholarDocument2, view);
            }
        });
        if (StringsKt.contains$default((CharSequence) scholarDocument2.TuitionPaymentFragmentbindingInflater1, (CharSequence) "image", false, 2, (Object) null)) {
            ImageView imageView4 = itemScholarProveFileBinding.itemScholarProveIcon;
            Intrinsics.checkNotNullExpressionValue(imageView4, "");
            imageView4.setVisibility(8);
            ImageView imageView5 = itemScholarProveFileBinding.itemScholarProveImage;
            Intrinsics.checkNotNullExpressionValue(imageView5, "");
            imageView5.setVisibility(0);
            if ((scholarDocument2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof Uri) || (scholarDocument2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof File)) {
                Glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1(itemScholarProveFileBinding.getRoot()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(scholarDocument2.TuitionPaymentFragmentspecialinlinedviewModeldefault1).d().into(itemScholarProveFileBinding.itemScholarProveImage);
                return;
            }
            return;
        }
        TextView textView5 = itemScholarProveFileBinding.itemScholarProveFile;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(0);
        ImageView imageView6 = itemScholarProveFileBinding.itemScholarProveImage;
        Intrinsics.checkNotNullExpressionValue(imageView6, "");
        imageView6.setVisibility(8);
        if (scholarDocument2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            ImageView imageView7 = itemScholarProveFileBinding.itemScholarProveIcon;
            Intrinsics.checkNotNullExpressionValue(imageView7, "");
            imageView7.setVisibility(0);
            itemScholarProveFileBinding.itemScholarProveFile.setText("Upload Bukti Pendukung");
            return;
        }
        ImageView imageView8 = itemScholarProveFileBinding.itemScholarProveIcon;
        Intrinsics.checkNotNullExpressionValue(imageView8, "");
        imageView8.setVisibility(8);
        itemScholarProveFileBinding.itemScholarProveFile.setText("Lihat File Pdf");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemScholarProveFileBinding itemScholarProveFileBindingInflate = ItemScholarProveFileBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemScholarProveFileBindingInflate, "");
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, itemScholarProveFileBindingInflate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public updateMaximumSizeByFormat(FragmentActivity fragmentActivity, Function2<? super Integer, ? super ScholarDocument, Unit> function2, Function2<? super Integer, ? super ScholarDocument, Unit> function3) {
        super(new b());
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        this.TuitionPaymentFragmentbindingInflater1 = fragmentActivity;
        this.b = function2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function3;
    }

    static final class b extends DiffUtil.ItemCallback<ScholarDocument> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final /* synthetic */ boolean areContentsTheSame(ScholarDocument scholarDocument, ScholarDocument scholarDocument2) {
            ScholarDocument scholarDocument3 = scholarDocument;
            ScholarDocument scholarDocument4 = scholarDocument2;
            Intrinsics.checkNotNullParameter(scholarDocument3, "");
            Intrinsics.checkNotNullParameter(scholarDocument4, "");
            return Intrinsics.areEqual(scholarDocument3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, scholarDocument4.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final /* synthetic */ boolean areItemsTheSame(ScholarDocument scholarDocument, ScholarDocument scholarDocument2) {
            ScholarDocument scholarDocument3 = scholarDocument;
            ScholarDocument scholarDocument4 = scholarDocument2;
            Intrinsics.checkNotNullParameter(scholarDocument3, "");
            Intrinsics.checkNotNullParameter(scholarDocument4, "");
            return Intrinsics.areEqual(scholarDocument3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, scholarDocument4.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends RecyclerView.ViewHolder {
        final ItemScholarProveFileBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final /* synthetic */ updateMaximumSizeByFormat TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(updateMaximumSizeByFormat updatemaximumsizebyformat, ItemScholarProveFileBinding itemScholarProveFileBinding) {
            super(itemScholarProveFileBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemScholarProveFileBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = updatemaximumsizebyformat;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = itemScholarProveFileBinding;
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(updateMaximumSizeByFormat updatemaximumsizebyformat, int i, ScholarDocument scholarDocument, View view) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
            try {
                Function2 function2 = updatemaximumsizebyformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(i), scholarDocument);
                }
            } finally {
                ViewPortBuilder.b();
            }
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(updateMaximumSizeByFormat updatemaximumsizebyformat, int i, ScholarDocument scholarDocument, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function2 function2 = updatemaximumsizebyformat.b;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(i), scholarDocument);
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(updateMaximumSizeByFormat updatemaximumsizebyformat, int i, ScholarDocument scholarDocument, View view) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
            try {
                Function2 function2 = updatemaximumsizebyformat.b;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(i), scholarDocument);
                }
            } finally {
                ViewPortBuilder.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ScholarDocument scholarDocument, updateMaximumSizeByFormat updatemaximumsizebyformat, int i, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            if (scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                Function2 function2 = updatemaximumsizebyformat.b;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(i), scholarDocument);
                }
            } else if (scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof Uri) {
                try {
                    Object obj = scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Intrinsics.checkNotNull(obj, "");
                    Intent intent = new Intent("android.intent.action.VIEW", (Uri) obj);
                    intent.addFlags(1);
                    updatemaximumsizebyformat.TuitionPaymentFragmentbindingInflater1.startActivity(intent);
                } catch (Exception unused) {
                }
            }
            return Unit.INSTANCE;
        }
    }
}
