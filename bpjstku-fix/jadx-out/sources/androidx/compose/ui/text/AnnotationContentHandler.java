package androidx.compose.ui.text;

import android.text.Editable;
import java.util.ArrayList;
import kotlin.Metadata;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0019\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\u00020\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0013J,\u0010\u001b\u001a\u00020\u000b2\n\u0010\u0002\u001a\u0006*\u00020\u00190\u00192\u0006\u0010\u0004\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u001c\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0002\u001a\u0006*\u00020\u00070\u0007H\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ,\u0010 \u001a\u00020\u000b2\n\u0010\u0002\u001a\u0006*\u00020\u00190\u00192\u0006\u0010\u0004\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b \u0010\u001cJ(\u0010!\u001a\u00020\u000b2\n\u0010\u0002\u001a\u0006*\u00020\u00070\u00072\n\u0010\u0004\u001a\u0006*\u00020\u00070\u0007H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u001c\u0010$\u001a\u00020\u000b2\n\u0010\u0002\u001a\u0006*\u00020#0#H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u001c\u0010&\u001a\u00020\u000b2\n\u0010\u0002\u001a\u0006*\u00020\u00070\u0007H\u0096\u0001¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b'\u0010\u0013J(\u0010(\u001a\u00020\u000b2\n\u0010\u0002\u001a\u0006*\u00020\u00070\u00072\n\u0010\u0004\u001a\u0006*\u00020\u00070\u0007H\u0096\u0001¢\u0006\u0004\b(\u0010\"R\u0014\u0010)\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101"}, d2 = {"Landroidx/compose/ui/text/AnnotationContentHandler;", "Lorg/xml/sax/ContentHandler;", "p0", "Landroid/text/Editable;", "p1", "<init>", "(Lorg/xml/sax/ContentHandler;Landroid/text/Editable;)V", "", "p2", "Lorg/xml/sax/Attributes;", "p3", "", "startElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V", "endElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "handleAnnotationStart", "(Lorg/xml/sax/Attributes;)V", "handleAnnotationEnd", "()V", "handleUlStart", "handleUlEnd", "handleLiStart", "handleLiEnd", "commitCurrentBulletSpan", "", "", "characters", "([CII)V", "endDocument", "endPrefixMapping", "(Ljava/lang/String;)V", "ignorableWhitespace", "processingInstruction", "(Ljava/lang/String;Ljava/lang/String;)V", "Lorg/xml/sax/Locator;", "setDocumentLocator", "(Lorg/xml/sax/Locator;)V", "skippedEntity", "startDocument", "startPrefixMapping", "contentHandler", "Lorg/xml/sax/ContentHandler;", "output", "Landroid/text/Editable;", "bulletIndentation", "I", "Landroidx/compose/ui/text/BulletSpanWithLevel;", "currentBulletSpan", "Landroidx/compose/ui/text/BulletSpanWithLevel;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AnnotationContentHandler implements ContentHandler {
    private int bulletIndentation;
    private final ContentHandler contentHandler;
    private BulletSpanWithLevel currentBulletSpan;
    private final Editable output;

    public AnnotationContentHandler(ContentHandler contentHandler, Editable editable) {
        this.contentHandler = contentHandler;
        this.output = editable;
    }

    @Override // org.xml.sax.ContentHandler
    public final void startElement(String p0, String p1, String p2, Attributes p3) throws SAXException {
        if (p1 != null) {
            int iHashCode = p1.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && p1.equals("ul")) {
                        handleUlStart();
                        return;
                    }
                } else if (p1.equals("li")) {
                    handleLiStart();
                    return;
                }
            } else if (p1.equals("annotation")) {
                if (p3 != null) {
                    handleAnnotationStart(p3);
                    return;
                }
                return;
            }
        }
        this.contentHandler.startElement(p0, p1, p2, p3);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endElement(String p0, String p1, String p2) throws SAXException {
        if (p1 != null) {
            int iHashCode = p1.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && p1.equals("ul")) {
                        handleUlEnd();
                        return;
                    }
                } else if (p1.equals("li")) {
                    handleLiEnd();
                    return;
                }
            } else if (p1.equals("annotation")) {
                handleAnnotationEnd();
                return;
            }
        }
        this.contentHandler.endElement(p0, p1, p2);
    }

    private final void handleAnnotationStart(Attributes p0) {
        int length = p0.getLength();
        for (int i = 0; i < length; i++) {
            String localName = p0.getLocalName(i);
            if (localName == null) {
                localName = "";
            }
            String value = p0.getValue(i);
            String str = value != null ? value : "";
            if (localName.length() > 0 && str.length() > 0) {
                int length2 = this.output.length();
                this.output.setSpan(new AnnotationSpan(localName, str), length2, length2, 17);
            }
        }
    }

    private final void handleAnnotationEnd() {
        Editable editable = this.output;
        Object[] spans = editable.getSpans(0, editable.length(), AnnotationSpan.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (this.output.getSpanFlags((AnnotationSpan) obj) == 17) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            AnnotationSpan annotationSpan = (AnnotationSpan) arrayList2.get(i);
            int spanStart = this.output.getSpanStart(annotationSpan);
            int length = this.output.length();
            this.output.removeSpan(annotationSpan);
            if (spanStart != length) {
                this.output.setSpan(annotationSpan, spanStart, length, 33);
            }
        }
    }

    private final void handleUlStart() {
        commitCurrentBulletSpan();
        this.bulletIndentation++;
    }

    private final void handleUlEnd() {
        commitCurrentBulletSpan();
        this.bulletIndentation--;
    }

    private final void handleLiStart() {
        commitCurrentBulletSpan();
        this.currentBulletSpan = new BulletSpanWithLevel(Bullet.INSTANCE.getDefault(), this.bulletIndentation, this.output.length());
    }

    private final void handleLiEnd() {
        commitCurrentBulletSpan();
    }

    private final void commitCurrentBulletSpan() {
        BulletSpanWithLevel bulletSpanWithLevel = this.currentBulletSpan;
        if (bulletSpanWithLevel != null) {
            this.output.setSpan(bulletSpanWithLevel, bulletSpanWithLevel.getStart(), this.output.length(), 33);
        }
        this.currentBulletSpan = null;
    }

    @Override // org.xml.sax.ContentHandler
    public final void characters(char[] p0, int p1, int p2) throws SAXException {
        this.contentHandler.characters(p0, p1, p2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endDocument() throws SAXException {
        this.contentHandler.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void endPrefixMapping(String p0) throws SAXException {
        this.contentHandler.endPrefixMapping(p0);
    }

    @Override // org.xml.sax.ContentHandler
    public final void ignorableWhitespace(char[] p0, int p1, int p2) throws SAXException {
        this.contentHandler.ignorableWhitespace(p0, p1, p2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void processingInstruction(String p0, String p1) throws SAXException {
        this.contentHandler.processingInstruction(p0, p1);
    }

    @Override // org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator p0) {
        this.contentHandler.setDocumentLocator(p0);
    }

    @Override // org.xml.sax.ContentHandler
    public final void skippedEntity(String p0) throws SAXException {
        this.contentHandler.skippedEntity(p0);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startDocument() throws SAXException {
        this.contentHandler.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void startPrefixMapping(String p0, String p1) throws SAXException {
        this.contentHandler.startPrefixMapping(p0, p1);
    }
}
