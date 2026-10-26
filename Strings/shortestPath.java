public class shortestPath {
    public static float getShortestPath(String path){
        int x = 0, y = 0;

        for(int i = 0; i < path.length(); i++){
            char dir = path.charAt(i);

            if(dir == 'S'){
                y--;
            }
            else if(dir == 'W'){
                x--;
            }
            else if(dir == 'N'){
                y++;
            }
            else {  // 'E'
                x++;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;

        float res = (float)Math.sqrt(X2 + Y2);
        return res;
    }
        
    public static void main(String[] args) {
        String path = "WNEENSENNSW";
        System.out.println(getShortestPath(path));
    }
}