public class Planet {
    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;

    public Planet(double xP,double yP,double xV,double yV,double m,String img){
        this.xxPos=xP;
        this.yyPos=yP;
        this.xxVel=xV;
        this.yyVel=yV;
        this.mass=m;
        this.imgFileName=img;
    }

    public Planet(Planet p){
        this.xxPos=p.xxPos;
        this.yyPos=p.yyPos;
        this.xxVel=p.xxVel;
        this.yyVel=p.yyVel;
        this.mass=p.mass;
        this.imgFileName=p.imgFileName;
    }

    public double calcForceExertedByX(Planet p){
        double r=Math.sqrt(((this.xxPos-p.xxPos)*(this.xxPos-p.xxPos)) +((this.yyPos-p.yyPos)*(this.yyPos-p.yyPos)));
        double net_force= ((6.67 / 1e11)*this.mass*p.mass)/(r*r);
        double dx=Math.abs(this.xxPos-p.xxPos);
        return net_force*(dx/r);
    }

    public double calcForceExertedByY(Planet p){
        double r=Math.sqrt(((this.xxPos-p.xxPos)*(this.xxPos-p.xxPos)) +((this.yyPos-p.yyPos)*(this.yyPos-p.yyPos)));
        double net_force= ((6.67 / 1e11)*this.mass*p.mass)/(r*r);
        double dy=Math.abs(this.yyPos-p.yyPos);
        return net_force*(dy/r);
    }
}
