package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aZ\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000028\u0010\u0007\u001a4\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000b\u001a\u00020\u0006*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a8\u0010\u0010\u001a\u00020\u0006*\u00020\r2\"\u0010\u0001\u001a\u001e\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u000eH\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a8\u0010\u0012\u001a\u00020\u0006*\u00020\r2\"\u0010\u0001\u001a\u001e\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u000eH\u0087\b¢\u0006\u0004\b\u0012\u0010\u0011\u001a!\u0010\u0014\u001a\u00020\u0006*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\u0006*\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0018\u001a\u00020\u0006*\u00020\n¢\u0006\u0004\b\u0018\u0010\u0017"}, d2 = {"", "p0", "p1", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "", "p2", "findCommonPrefixAndSuffix", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "delete", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;II)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "Lkotlin/Function2;", "Landroidx/compose/ui/text/TextRange;", "forEachChange", "(Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;Lkotlin/jvm/functions/Function2;)V", "forEachChangeReversed", "", "insert", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;ILjava/lang/String;)V", "placeCursorAtEnd", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "selectAll"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldBufferKt {
    public static final void insert(TextFieldBuffer textFieldBuffer, int i, String str) {
        textFieldBuffer.replace(i, i, str);
    }

    public static final void delete(TextFieldBuffer textFieldBuffer, int i, int i2) {
        textFieldBuffer.replace(i, i2, "");
    }

    public static final void placeCursorAtEnd(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.placeCursorBeforeCharAt(textFieldBuffer.getLength());
    }

    public static final void selectAll(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.m1424setSelection5zctL8(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
    }

    public static final void forEachChange(TextFieldBuffer.ChangeList changeList, Function2<? super TextRange, ? super TextRange, Unit> function2) {
        for (int i = 0; i < changeList.getChangeCount(); i++) {
            function2.invoke(TextRange.m6385boximpl(changeList.mo1427getRangejx7JFs(i)), TextRange.m6385boximpl(changeList.mo1426getOriginalRangejx7JFs(i)));
        }
    }

    public static final void forEachChangeReversed(TextFieldBuffer.ChangeList changeList, Function2<? super TextRange, ? super TextRange, Unit> function2) {
        for (int changeCount = changeList.getChangeCount() - 1; changeCount >= 0; changeCount--) {
            function2.invoke(TextRange.m6385boximpl(changeList.mo1427getRangejx7JFs(changeCount)), TextRange.m6385boximpl(changeList.mo1426getOriginalRangejx7JFs(changeCount)));
        }
    }

    public static final void findCommonPrefixAndSuffix(CharSequence charSequence, CharSequence charSequence2, Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
        int i;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i2 = 0;
        if (charSequence.length() <= 0 || charSequence2.length() <= 0) {
            i = 0;
        } else {
            boolean z = false;
            i = 0;
            boolean z2 = false;
            while (true) {
                if (!z) {
                    if (charSequence.charAt(i2) == charSequence2.charAt(i)) {
                        i2++;
                        i++;
                    } else {
                        z = true;
                    }
                }
                if (!z2) {
                    int i3 = length - 1;
                    int i4 = length2 - 1;
                    if (charSequence.charAt(i3) == charSequence2.charAt(i4)) {
                        length = i3;
                        length2 = i4;
                    } else {
                        z2 = true;
                    }
                }
                if (i2 >= length || i >= length2 || (z && z2)) {
                    break;
                }
            }
        }
        if (i2 < length || i < length2) {
            function4.invoke(Integer.valueOf(i2), Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(length2));
        }
    }
}
