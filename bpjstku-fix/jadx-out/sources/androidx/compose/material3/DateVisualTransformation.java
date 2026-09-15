package androidx.compose.material3;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f"}, d2 = {"Landroidx/compose/material3/DateVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "Landroidx/compose/material3/DateInputFormat;", "p0", "<init>", "(Landroidx/compose/material3/DateInputFormat;)V", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/TransformedText;", "filter", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", "", "dateFormatLength", "I", "dateInputFormat", "Landroidx/compose/material3/DateInputFormat;", "Landroidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1;", "dateOffsetTranslator", "Landroidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1;", "firstDelimiterOffset", "secondDelimiterOffset"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DateVisualTransformation implements VisualTransformation {
    private final int dateFormatLength;
    private final DateInputFormat dateInputFormat;
    private final DateVisualTransformation$dateOffsetTranslator$1 dateOffsetTranslator = new OffsetMapping() { // from class: androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1
        @Override // androidx.compose.ui.text.input.OffsetMapping
        public final int originalToTransformed(int p0) {
            if (p0 < this.this$0.firstDelimiterOffset) {
                return p0;
            }
            if (p0 < this.this$0.secondDelimiterOffset) {
                return p0 + 1;
            }
            return p0 <= this.this$0.dateFormatLength ? p0 + 2 : this.this$0.dateFormatLength + 2;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public final int transformedToOriginal(int p0) {
            if (p0 <= this.this$0.firstDelimiterOffset - 1) {
                return p0;
            }
            if (p0 <= this.this$0.secondDelimiterOffset - 1) {
                return p0 - 1;
            }
            return p0 <= this.this$0.dateFormatLength + 1 ? p0 - 2 : this.this$0.dateFormatLength;
        }
    };
    private final int firstDelimiterOffset;
    private final int secondDelimiterOffset;

    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1] */
    public DateVisualTransformation(DateInputFormat dateInputFormat) {
        this.dateInputFormat = dateInputFormat;
        this.firstDelimiterOffset = StringsKt.indexOf$default((CharSequence) dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (Object) null);
        this.secondDelimiterOffset = StringsKt.lastIndexOf$default((CharSequence) dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (Object) null);
        this.dateFormatLength = dateInputFormat.getPatternWithoutDelimiters().length();
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText filter(AnnotatedString p0) {
        String text;
        int i = 0;
        if (p0.getText().length() > this.dateFormatLength) {
            text = StringsKt.substring(p0.getText(), RangesKt.until(0, this.dateFormatLength));
        } else {
            text = p0.getText();
        }
        String str = text;
        String string = "";
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(cCharAt);
            String string2 = sb.toString();
            if (i3 == this.firstDelimiterOffset || i2 + 2 == this.secondDelimiterOffset) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string2);
                sb2.append(this.dateInputFormat.getDelimiter());
                string = sb2.toString();
            } else {
                string = string2;
            }
            i++;
            i2 = i3;
        }
        return new TransformedText(new AnnotatedString(string, null, null, 6, null), this.dateOffsetTranslator);
    }
}
