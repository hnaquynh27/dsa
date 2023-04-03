package ex1;

public class Complex {
    private float real, img;

    public Complex() {
    }

    public Complex(float real, float img) {
        this.real = real;
        this.img = img;
    }

    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public float getImg() {
        return img;
    }

    public void setImg(float img) {
        this.img = img;
    }

    public Complex add(Complex right) {
        return new Complex(this.real + right.getReal(), this.img + right.getImg());
    }

    public Complex addInto(Complex right) {
        setReal(this.real + right.getReal());
        setImg(this.img + right.getImg());
        return this;
    }

    public Complex minus(Complex right) {
        return new Complex(this.real - right.getReal(), this.img - right.getImg());
    }

    public Complex time(Complex right) {
        return new Complex(this.real * right.getReal() - this.img * right.getImg(), this.real * right.getImg() + this.img * right.getReal());
    }

    @Override
    public String toString() {
        if (this.real == 0) {
            return Float.toString(this.img) + "i";
        } else if (this.img == 0) {
            return Float.toString(this.real);
        }
        return real + " + " + img + "i";
    }
}
