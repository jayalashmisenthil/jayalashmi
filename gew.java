boolean isInside = ((r1x1 >= r2x1) && (r1x2 >= r2x2) 
        && (r1y1 >= r2y1) && (r1y2 <= r2y2));


boolean isOverLap = (!(r1x1 >= r2x2) && !(r1x2 <= r2x2)
        && !(r1y2 >= r2y1) && !(r1y1 <= r2y2))
boolean isNotOverLap = ((r1x1 >= r2x2) || (r1x2 <= r2x2)
        || (r1y2 >= r2y1) || (r1y1 <= r2y2));