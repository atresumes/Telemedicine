package org.webrtc.sinch;

public class Size {
    public int height;
    public int width;

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.width == size.width && this.height == size.height;
    }

    public int hashCode() {
        return ((65537 * this.width) + 1) + this.height;
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
