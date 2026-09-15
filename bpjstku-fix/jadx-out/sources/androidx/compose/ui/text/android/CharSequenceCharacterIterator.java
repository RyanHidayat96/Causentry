package androidx.compose.ui.text.android;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.CharacterIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0001H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c"}, d2 = {"Landroidx/compose/ui/text/android/CharSequenceCharacterIterator;", "", "Ljava/text/CharacterIterator;", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/CharSequence;II)V", "", "first", "()C", "last", "current", "next", "previous", "setIndex", "(I)C", "getBeginIndex", "()I", "getEndIndex", "getIndex", "clone", "()Ljava/lang/Object;", "charSequence", "Ljava/lang/CharSequence;", "start", "I", "end", FirebaseAnalytics.Param.INDEX}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CharSequenceCharacterIterator implements CharacterIterator {
    public static final int $stable = 8;
    private final CharSequence charSequence;
    private final int end;
    private int index;
    private final int start;

    public CharSequenceCharacterIterator(CharSequence charSequence, int i, int i2) {
        this.charSequence = charSequence;
        this.start = i;
        this.end = i2;
        this.index = i;
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.index = this.start;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.start;
        int i2 = this.end;
        if (i == i2) {
            this.index = i2;
            return CharCompanionObject.MAX_VALUE;
        }
        int i3 = i2 - 1;
        this.index = i3;
        return this.charSequence.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.index;
        return i == this.end ? CharCompanionObject.MAX_VALUE : this.charSequence.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.index + 1;
        this.index = i;
        int i2 = this.end;
        if (i >= i2) {
            this.index = i2;
            return CharCompanionObject.MAX_VALUE;
        }
        return this.charSequence.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.index;
        if (i <= this.start) {
            return CharCompanionObject.MAX_VALUE;
        }
        int i2 = i - 1;
        this.index = i2;
        return this.charSequence.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int p0) {
        int i = this.start;
        if (p0 <= this.end && i <= p0) {
            this.index = p0;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.start;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.end;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.index;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }
}
