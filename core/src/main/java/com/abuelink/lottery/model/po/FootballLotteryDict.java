package com.abuelink.lottery.model.po;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_FOOTBALL_LOTTERY_DICT")
public class FootballLotteryDict implements java.io.Serializable{

  @Id
  @Column(name = "ID")
  private String id;

  @Column(name = "BET_KIND")
  private String betKind;

  @Column(name = "BET_SUB_KIND")
  private String betSubKind;

  @Column(name = "LET_BALLS")
  private String letBalls;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getBetKind() {
    return betKind;
  }

  public void setBetKind(String betKind) {
    this.betKind = betKind;
  }

  public String getBetSubKind() {
    return betSubKind;
  }

  public void setBetSubKind(String betSubKind) {
    this.betSubKind = betSubKind;
  }

  public String getLetBalls() {
    return letBalls;
  }

  public void setLetBalls(String letBalls) {
    this.letBalls = letBalls;
  }
}
