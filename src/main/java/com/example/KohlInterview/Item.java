package com.example.KohlInterview;
import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Item {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    String portfolioName;
    String side;
    String securityId;

    String accountName;
    Integer sodPosition;
    Integer positionFilled;
    Integer currentPosition;
    Integer closePrice;
    Double currentPrice;


    public Item(int id, String portfolioName, String side, String securityId,
                String accountName, int sodPosition, int positionFilled, int currentPosition, int closePrice,
                double currentPrice) {
      this.id = id;
      this.portfolioName = portfolioName;
      this.side = side;
      this.securityId = securityId;
      this.accountName = accountName;
      this.sodPosition = sodPosition;
      this.positionFilled = positionFilled;
      this.currentPosition = currentPosition;
      this.closePrice = closePrice;
      this.currentPrice = currentPrice;
    }

    public int getId(){
        return id;
    }
    public String getSide(){
        return side;
    }

    public String getSecurityId(){
        return securityId;
    }
}
