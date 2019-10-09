package lab18;

/**
 * Created by Brain on 07.10.2019.
 */
public class UserBank {


    public static void main(String[] args) {
        try {
            MoneyTransactionUtil.sendTo(6546464, 6546464, 520);
            MoneyTransactionUtil.sendTo(6546464, 6546465, -5);
        } catch (AcountExceptions e) {
            System.out.println("«Ошибка с реквизитами банка. Возможно,номер карты отправителя и получателя совпадают.»");
        } catch (MoneyValueExceptions e) {
            System.out.println("«Ошибка с суммой отправки. Суммадолжна быть больше 0. Сумма не должна превышать лимит в 100000»");
        } catch (RuntimeException e) {
            System.out.println("«При обработке транзакции банка произошла ошибка»");
        }

    }
}

