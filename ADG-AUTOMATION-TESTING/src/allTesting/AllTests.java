package allTesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ _01Login.class, _02News.class, _03MembersMenu_MyProfile.class, _04MembersMenu_ReferNewMember.class,
		_05MembersMenu_BinaryLRtreeView_AddNewMember.class, _06MembersMenu_ReferredMembers.class,
		_07MembersMenu_BinaryLRMember.class, _08MembersMenu_ReferralsTreeView.class,
		_09MemberMenu_BinaryLRtreeView.class, _10MainMenu_ChangePassWord.class, _11MemberMenu_ResetMemberPassword.class,
		_12MainMenu_ChangeMemberBankAccount.class, _13PocketsMenu_MyA_PTSlist.class, _14PocketsMenu_MyE_PTSlist.class,
		_15PocketsMenu_MyS_PTSlist.class, _16PocketsMenu_MyR_PTSlist.class, _17PocketsMenu_MyE_CASHlist.class,
		_18PocketsMenu_My_Pocket.class, _19PocketsMenu_E_CashToA_PTS.class, _20PocketsMenu__A_PTSToE_PTS.class,
		_21PocketsMenu__AssignMemberE_PTS.class, _22PocketsMenu__Admin_E_PTS_Record.class,
		_23PocketsMenu__AdminCashOutInCash.class, _24PocketsMenu__CashOutDiamondGuarantee.class,
		_25ShareMenu_MyE_Fund.class, _26ShareMenu_MyP_Fund.class, _27ShareMenu_MyR_Fund.class,
		_28ShareMenu_MyShares.class, _29TradeMenu_MyOpenTrades.class, _30TradeMenu_MyHistoryTrades.class,
		_31TradeMenu_AllMemberOpenTrades.class, _32TradeMenu_AllMembeHistoryTrades.class, _33TradeMenu_BuyShares.class,
		_34TradeMenu_SellShares.class, _35MainMenu_MembersMenu.class, _36MainMenu_ManageNews.class,
		_37ManageNews_AddNews.class, _38ManageNews_EditNews.class, _39ManageNews_DeleteNews.class,
		_40MainMenu_ManageEvents.class, _41ManageEvents_AddEvent.class, _42MainMenu_ManageCodeTable.class,
		_43ManageCodeTable_AddCode.class, _44ManageCodeTable_EditCode.class, _45ManageCodeTable_DeleteCode.class,
		_46ManageCodeTable_ManageDeletedCodes.class, _47MainMenu_SeqnumTable.class, _48MainMenu_TradeSettings.class })
public class AllTests {

}
