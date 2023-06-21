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
        double r=calcDistance(p);
        double net_force= calcForceExertedBy(p);
        double dx=Math.abs(this.xxPos-p.xxPos);
        return net_force*(dx/r);
    }

    public double calcForceExertedByY(Planet p){
        double r=calcDistance(p);
        double net_force= calcForceExertedBy(p);
        double dy=Math.abs(this.yyPos-p.yyPos);
        return net_force*(dy/r);
    }

    public double calcDistance(Planet p){
        return Math.sqrt(((this.xxPos-p.xxPos)*(this.xxPos-p.xxPos)) +((this.yyPos-p.yyPos)*(this.yyPos-p.yyPos)));
    }

    public double calcForceExertedBy(Planet p){
        if (this.equals(p)){
           return 0;
        }
        return ((6.67 / 1e11)*this.mass*p.mass)/(calcDistance(p)*calcDistance(p));
    }

    public double calcNetForceExertedByX(Planet[] p_list){
        double total_force=0;
        for (Planet planet : p_list) {
            total_force = total_force + calcForceExertedByX(planet);
        }
        return total_force;
    }

    public double calcNetForceExertedByY(Planet[] p_list){
        double total_force=0;
        for (Planet planet : p_list) {
            total_force = total_force + calcForceExertedByY(planet);
        }
        return total_force;
    }
}
