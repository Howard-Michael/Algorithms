package Math.Geometry;

/**
 *
 * Will convert between Cartesian, Cylindrical, and Spherical coordinate systems in 3D space.
 * 
 * @author Michael
 */
public class CoordinateConversion3D {
    
    public static void main(String[] args) {
        fromCartesianToCylindrical(1,1,1);
        fromCartesionToSpherical(1,1,1);
        
        fromCylindricalToCartesion(1,1,1);
        fromCylindricalToSpherical(1,1,1);
        
        fromSphericalToCartesion(1,1,1);
        fromSphericalToCylindrical(1,1,1);
        
    }
    
    //input x, y, z
    //Gives r/theta/z in redians
    public static void fromCartesianToCylindrical(double x, double y, double z){
        double r, theta;
        r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if(x==0 & y==0)
            theta = 0;
        else if(x>=0)
            theta = Math.asin(y/r);
        else
            theta = 0 - Math.asin(y/r) + Math.PI;  
        //z=z;   
        
        System.out.println("r = " + r + ", theta = " + theta + ", z = " + z);
    }
    
    //input x, y, z
    //Gives rho/theta/phi in redians
    public static void fromCartesionToSpherical(double x, double y, double z){
        double rho, theta, phi;
        
        rho = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)+ Math.pow(z, 2));
        theta = Math.atan((Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)))/z);
        phi = Math.atan(y/x);

        System.out.println("rho = " + rho + ", theta = " + theta + ", phi = " + phi);
    }
    
    
    //input r, theta, z
    //Gives x/y/z in radians
    public static void fromCylindricalToCartesion(double r, double theta, double z){
        double x, y;
        x = r * Math.cos(theta);
        y = r * Math.sin(theta);
        //z = z;
        
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }
    
    //input r, theta, z
    //Gives rho/theta/phi in radians
    public static void fromCylindricalToSpherical(double r, double theta, double z){
        double rho, phi;
        rho = Math.sqrt(Math.pow(r, 2)+Math.pow(z, 2));
        //theta = theta;
        phi = Math.atan(r/z);
        
        System.out.println("rho = " + rho + ", theta = " + theta + ", phi = " + phi);
    }
    
    //input rho, theta, phi 
    // Gives x/y/z in radians
    public static void fromSphericalToCartesion(double rho, double theta, double phi){
        double x, y, z;
        x = rho * Math.sin(theta) * Math.cos(phi);
        y = rho * Math.sin(theta) * Math.sin(phi);
        z = rho * Math.cos(theta);
    
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }
    
    //input rho, theta, phi, 
    //Gives r/theta/z in radians
    public static void fromSphericalToCylindrical(double rho, double theta, double phi){
        double r, z;
        r = rho * Math.sin(phi);
        z = rho * Math.cos(phi);
        //theta = theta;
        
        System.out.println("r = " + r + ", theta = " + theta + ", z = " + z);
    }
}
