package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aR\u0010\b\u001a\u00020\u0007*\u00020\u00002<\b\u0004\u0010\u0006\u001a6\u0012\u000b\u0012\t\u0018\u00010\u0002¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b¢\u0006\u0004\b\b\u0010\t\u001aR\u0010\n\u001a\u00020\u0007*\u00020\u00002<\b\u0004\u0010\u0006\u001a6\u0012\u000b\u0012\t\u0018\u00010\u0002¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b¢\u0006\u0004\b\n\u0010\t\u001a1\u0010\r\u001a\u00020\u0007*\u00020\u00002\u001b\b\u0004\u0010\u0006\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010\f¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00050\u000bH\u0087\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u00ad\u0001\u0010\u0011\u001a\u00020\u0007*\u00020\u00002<\b\u0006\u0010\u0006\u001a6\u0012\u000b\u0012\t\u0018\u00010\u0002¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00050\u00012<\b\u0006\u0010\u000f\u001a6\u0012\u000b\u0012\t\u0018\u00010\u0002¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00050\u00012\u001b\b\u0006\u0010\u0010\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010\f¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00050\u000bH\u0087\b¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "", "", "p0", "Landroid/text/TextWatcher;", "doBeforeTextChanged", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function4;)Landroid/text/TextWatcher;", "doOnTextChanged", "Lkotlin/Function1;", "Landroid/text/Editable;", "doAfterTextChanged", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)Landroid/text/TextWatcher;", "p1", "p2", "addTextChangedListener", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;)Landroid/text/TextWatcher;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TextViewKt {
    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, Function4 function4, Function4 function5, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function4 = new Function4<CharSequence, Integer, Integer, Integer, Unit>() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.1
                public final void invoke(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // kotlin.jvm.functions.Function4
                public final /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            function5 = new Function4<CharSequence, Integer, Integer, Integer, Unit>() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.2
                public final void invoke(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // kotlin.jvm.functions.Function4
                public final /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            function1 = new Function1<Editable, Unit>() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Editable editable) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Editable editable) {
                    invoke2(editable);
                    return Unit.INSTANCE;
                }
            };
        }
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(function1, function4, function5);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final TextWatcher addTextChangedListener(TextView textView, Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function4, Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function5, Function1<? super Editable, Unit> function1) {
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(function1, function4, function5);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final TextWatcher doBeforeTextChanged(TextView textView, final Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable p0) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
                function4.invoke(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doOnTextChanged(TextView textView, final Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable p0) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
                function4.invoke(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doAfterTextChanged(TextView textView, final Function1<? super Editable, Unit> function1) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable p0) {
                function1.invoke(p0);
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }
}
